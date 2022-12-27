import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
    System.out.print("Enter your age: : ");
    int age = user.nextInt();

    // if-elif-else conditionals statements.
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

    // Switch Case Statement
    switch (age) {
      case 18:
        System.out.println("You\'re going to become an adult.");
        break;
      case 23:
        System.out.println("You\'re going to join a job.");
        break;
      case 60:
        System.out.println("You\'re going to join a job.");
        break;
      default:
        System.out.println("Enjoy your life.");
        break;
    }

    // Enhance Switch Case Statement
    switch (age) {
      case 18 -> System.out.println("You\'re going to become an adult.");
      case 23 -> System.out.println("You\'re going to join a job.");
      case 60 -> System.out.println("You\'re going to join a job.");
      default -> System.out.println("Enjoy your life.");
    }

  }
}
