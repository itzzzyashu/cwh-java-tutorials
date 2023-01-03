class Base1 {
  Base1() {
    System.out.println("I\'m a constructor");
  }
  Base1(int x) {
    System.out.println("I\'m a overloaded constructor with value of x as: " + x);
  }
}

class Derived1 extends Base1 {
  Derived1() {
    System.out.println("I\'m a derived class constructor");
  }
  Derived1(int x, int y) {
    super(x);
    System.out.println("I\'m a overloaded constructor of derived with value of y as: " + y);
  }
}

class ChildDerived1 extends Derived1 {
  ChildDerived1() {
    System.out.println("I\'m a child of derived class constructor");
  }
  ChildDerived1(int x, int y, int z) {
    super(x, y);
    System.out.println("I\'m a overloaded child constructor of derived with value of z as: " + z);
  }
}

public class Constructors_in_Inheritance {
  public static void main(String[] args) {
    // Base1 b = new Base1();
    // Derived1 d = new Derived1();
    // Derived1 d = new Derived1(14,9);
    // ChildDerived1 cd = new ChildDerived1();
    ChildDerived1 cd = new ChildDerived1(12, 13, 15);
  }
}