package app.a;

/**
 *
 * @author Alex Conro Manuel
 */
public class ClassA {

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
    this.method1();
    this.method2();
    this.method3();
    this.method4();

    System.out.println(this.var1);
    System.out.println(this.var2);
    System.out.println(this.var3);
    System.out.println(this.var4);
  }

}
