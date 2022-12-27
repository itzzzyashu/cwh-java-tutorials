public class Rational_Logical {
  public static void main(String[] args) {
    boolean a, b;
    a = true;
    b = false;

    // Logical AND
    System.out.print("Logical AND: ");
    if (a && b) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
    
    // Logical OR
    System.out.print("Logical OR: ");
    if (a || b) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
    
    // Logical NOT
    System.out.print("Logical NOT: ");
    if (!a) {
      System.out.println("a = false");
    } else {
      System.out.println("a = true");
    }
  }
}
