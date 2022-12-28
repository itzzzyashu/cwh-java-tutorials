// Write a program to print the factorial of a given number.
// n = n * (n-1)
// 5! = 5*4*3*2*1 = 120

public class Factoral {
  public static void main(String[] args) {
    int n = 5;
    int i = 1;
    int factorial = 1;
    while (i <= n) {
      factorial *= i;
      i++;
    }
    System.out.println(factorial);
  }
}
