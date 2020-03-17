package student.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex Conro Manuel
 */
public class Main {

    /* class-level attributes */
    private static List<String> nims = new ArrayList<>();
    private static List<String> names = new ArrayList<>();

    /* program entry point */
    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean quit = false;
        do {
            input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String output = "";
            switch (tokens[0]) {
                case "add":
                    add(tokens[1], tokens[2]);
                    break;
                case "count":
                    output = "" + count();
                    break;
                case "find":
                    output = find(tokens[1]);
                    break;
                case "reset":
                    Main.reset();
                    break;
                case "exit":
                    quit = true;
            }
            if (output.length() > 0) {
                System.out.println(output);
            }
        } while (!quit);

    }

    public static void add(String _nim, String _name) {
        int index = nims.indexOf(_nim);
        if (index == -1) {
            nims.add(_nim);
            names.add(_name);
        }

    }

    public static String find(String _nim) {
        int index = nims.indexOf(_nim);
        if (index >= 0) {
            return nims.get(index) + " " + names.get(index);
        }
        return "";
    }

    public static int count() {
        return nims.size();
    }

    public static void reset() {
        nims.clear();
        names.clear();
    }
}
