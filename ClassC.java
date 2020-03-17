package app.b;

import app.a.ClassA;

/**
 *
 * @author Alex Conro Manuel
 */
public class ClassC {

  public void explore() {
    ClassA objectA = new ClassA();
    //private method
    //objectA.method1();
    //protected method
    //objectA.method2();
    //no modifier method
    //objectA.method3();
    objectA.method4();

    //private variable
    //System.out.println(objectA.var1);
    //protected variable
    //System.out.println(objectA.var2);
    //no modifier method
    //System.out.println(objectA.var3);
    System.out.println(objectA.var4);
  }
}
