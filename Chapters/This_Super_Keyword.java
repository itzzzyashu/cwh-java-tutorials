// this keyword
class EkClass {

  int a;

  public int getA() {
    return a;
  }

  // It'll confuse and return 0
  // EkClass(int a) {
  //     a=a;
  // }

  // Use this.a instead
  EkClass(int a) {
    this.a = a;
  }
  // public int returnone() {
  //     return 1;
  // }
}

// super keyword
class DoClass extends EkClass {
  DoClass(int c) {
    super(c); // I wanna call a constructor which takes a integer (c)
    System.out.println("I\'m a constructor. My parameter value is: "+c);
  }
}

public class This_Super_Keyword {
  public static void main(String[] args) {
    EkClass e = new EkClass(65);
    System.out.println(e.getA());
    EkClass d = new DoClass(5);
  }
}
