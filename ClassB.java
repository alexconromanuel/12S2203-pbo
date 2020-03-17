package app.a;

/**
 *
 * @author Alex Conro Manuel
 */
public class ClassB {

  private String var1 = this.getClass().getName() + ".var1";
  protected String var2 = this.getClass().getName() + ".var2";
  String var3 = this.getClass().getName() + ".var3";
  public String var4 = this.getClass().getName() + ".var4";

  private void method1() {
    String str = this.getClass().getName() + "."
            + this.getClass().getEnclosingMethod().getName();
    System.out.println(str);
  }

  protected void method2() {
    String str = this.getClass().getName() + "."
            + this.getClass().getEnclosingMethod().getName();
    System.out.println(str);
  }

  void method3() {
    String str = this.getClass().getName() + "."
            + this.getClass().getEnclosingMethod().getName();
    System.out.println(str);
  }

  public void method4() {
    String str = this.getClass().getName() + "."
            + this.getClass().getEnclosingMethod().getName();
    System.out.println(str);
  }

  public void explore() {
    ClassA objectA = new ClassA();
    //private method
    //objectA.method1();
    objectA.method2();
    objectA.method3();
    objectA.method4();
    
    //private variable
    //System.out.println(objectA.var1);
    System.out.println(objectA.var2);
    System.out.println(objectA.var3);
    System.out.println(objectA.var4);
  }

}
