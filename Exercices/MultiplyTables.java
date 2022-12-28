// 2 Write program to print the multiply tables

public class MultiplyTables {
  public static void main(String[] args) {
    // 2 For Loop
    int num_of_tables = 20;
    for (int i = 1; i <= num_of_tables; i++) {
      System.out.println("\nThe table of " + i + " is");
      for (int n = 1; n <= 10; n++) {
        System.out.println(i + " x " + n + " = " + i * n);
      }
    }

    // 12 While Loop
    int num_of_tables = 20;
    int i = 1;
    while (i <= num_of_tables) {
      System.out.println("\nThe table of " + i + " is");
      int n = 1;
      while (n <= 10) {
        System.out.println(i + " x " + n + " = " + i * n);
        n++;
      }
      i++;
    }
  }
}
