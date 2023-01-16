/* Write a program to prinnt the below number pattern. 
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1 
*/
public class RepeatNumberPattern {
  public static void main(String[] args) {
    for (int i = 6; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
}
