// factorial(0) = 1;
// factorial(n) = n * (n+1) ........1
// factorial(n) = 5*4*3*2*1 = 120
// factirial(n) = n * factorial(n-1)
public class Recursion_and_Iterative_Call {
  static int factorial_recursion(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * factorial_recursion(n - 1);
    }
  }

  static int factorial_iterative(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      int product = 1;
      for (int i = 1; i <= n; i++) {
        product *= i;
      }
      return product;
    }
  }

  public static void main(String[] args) {
    int fac_num = 0;
    System.out.println(factorial_recursion(fac_num));
    System.out.println(factorial_iterative(fac_num));
  }
}
