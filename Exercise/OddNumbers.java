// Write a program to print first 10 odd numbers
// 2n+1 = 1,3,5,7,9,11,13,15...

public class OddNumbers {
  public static void main(String[] args) {
    int i = 10;
    for (int n = 0; n < i; n++) {
      System.out.println(2 * n + 1);
    }
  }
}
