// Write a program to print the sum of first n even numbers using while loop.

public class SumEvenNumbers {
  public static void main(String[] args) {
    int sum = 0;
    int n = 3;
    int i = 1;
    while (i < n) {
      sum = sum + (2 * i);
      i++;
    }
    System.out.println(sum);
  }
}
