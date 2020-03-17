
import app.a.ClassA;
import app.a.ClassB;
import app.a.SubClassA;
import app.b.AnotherSubClassA;
import app.b.ClassC;

/**
 *
 * @author Alex Conro Manuel
 */
public class Driver {

  public static void main(String _args[]) {
    ClassA objectA = new ClassA();
    ClassB objectB = new ClassB();
    ClassC objectC = new ClassC();
    SubClassA objectOfSubClassA = new SubClassA();
    AnotherSubClassA objectOfAnotherSubClassA = new AnotherSubClassA();

    objectA.explore();
    objectB.explore();
    objectC.explore();
    objectOfSubClassA.explore();
    objectOfAnotherSubClassA.explore();
  }
}
