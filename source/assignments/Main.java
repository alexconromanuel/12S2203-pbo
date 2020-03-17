
import java.util.ArrayList;

/**
 *
 * @author Alex Conro Manuel
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // declaring and manipulating primitive variables
        int gear = 1;
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        gear++;
        result = !result;
        capitalC += 4;
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        
        // 26 in hexadecimal and binary
        int hexVal = 0x1a;
        int binVal = 0b11010;
        System.out.println(hexVal + ", " + binVal);

        // intantiating and manipulating objects
        String name = "Wiro Sableng";
        Short gearObject = 1;
        Boolean resultObj = true;
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        name = name.toUpperCase();
        gearObject++;
        resultObj = (result == false) || !resultObj;
        System.out.println(name + ", " + gearObject + ", " + resultObj);

        // array, collections, and loop
        int[][] numbers = new int[10][10];
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                numbers[i][j] = i + j;
            }
        }
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
        
        //Ini jawaban celengs kalian semoga kegundahan kalian lenyap ;)       
        System.out.println("\nUsing ArrayList");
        ArrayList<Integer>[] numbers2 = new ArrayList[10];
        for (int i = 0; i < 10; ++i) {
            numbers2[i] = new ArrayList<>();
            for (int j = 0; j < 10; ++j) {
                numbers2[i].add(i + j);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers2[i].size(); j++) {
                System.out.print(numbers2[i].get(j) + " ");
            }
            System.out.println();
        }

    }
}
