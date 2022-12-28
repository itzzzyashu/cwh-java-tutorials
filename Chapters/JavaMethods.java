public class JavaMethods {
  // Uses DRY - Do not Repeat Yourself Principle.
  // The static keyword in Java is used for memory management mainly, Associate with class instead of class's object.
  // We can apply static keyword with variables, methods, blocks and nested classes.
  static int sumobj(int x, int y) {
    int z = x + y;
    return z;
  }

  int sum(int x, int y) {
    int z = x + y;
    return z;
  }

  public static void main(String[] args) {
    // Method Invocation using object creation
    // with static keyword
    System.out.println(sumobj(15, 15));

    // without static keyword
    JavaMethods obj = new JavaMethods();
    System.out.println(obj.sum(20, 20));
  }
}
