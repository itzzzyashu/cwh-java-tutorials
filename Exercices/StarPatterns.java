// Write a program to print the following pattern
// * * * * *
// * * * *
// * * *
// * *
// *

public class StarPatterns {
  public static void main(String[] args) {
    int times = 5;
    for (int i = times; i > 0; i--) {
      for (int n = 0; n < i; n++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
