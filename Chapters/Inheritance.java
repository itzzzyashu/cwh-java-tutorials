class Base {
  int x;
  public int getX() {
    System.out.println("Getting");
    return x;
  }
  public void setX(int x) {
    System.out.println("I\'m in base Setting x now.");
    this.x = x;
  }
  public void printMe() {
    System.out.println("I\'m a constructor.");
  }
}

class Derived extends Base {
  public int y;
  public int getY() {
    return y;
  }
  public void setY(int y) {
    this.y = y;
  }
  public void printMe() {
    System.out.println("I\'m a method.");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Base b = new Base();
    b.setX(10);
    System.out.println(b.getX());
    Derived d = new Derived();
    d.setY(20);
    System.out.println(d.getY());
  }
}
