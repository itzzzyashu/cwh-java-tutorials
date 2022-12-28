public class JavaMethods {
  // Uses DRY - Do not Repeat Yourself Principle.
  int sum(int x, int y) {
    int z = x + y;
    return z;
  }

  public static void main(String[] args) {
    // Method Invocation using object creation
    JavaMethods obj = new JavaMethods();
    System.out.println(obj.sum(90, 75));
  }
}
