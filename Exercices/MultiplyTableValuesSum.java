// Write a program to print sum of the multiplied table value of a number.

public class MultiplyTableValuesSum {
  public static void main(String[] args) {
    int n = 8;
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += n * i;
    }
    System.out.println(sum);
  }
}
