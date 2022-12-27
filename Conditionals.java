import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {
    // if-elif-else conditionals statements.
    Scanner user = new Scanner(System.in);
    System.out.print("Enter your age: : ");
    int age = user.nextInt();
    if (age > 19) {
      if (age > 70) {
        System.out.println("Yes, You are experienced.");
      } else if (age > 40) {
        System.out.println("You are semi-experienced.");
      } else if (age > 30) {
        System.out.println("Yes, You are semi-semi-experienced.");
      } else {
        System.out.println("No, You are not experienced.");
      }
    } else {
      System.out.println("You are too young!");
    }
  }
}
