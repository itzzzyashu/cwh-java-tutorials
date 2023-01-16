import java.util.Scanner;

public class TriangleAngleTypes {
  public static void main(String[] args) {
    int a,b,c;
    String angle = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of angle a: ");
    a = sc.nextInt();
    System.out.print("Enter the value of angle b: ");
    b = sc.nextInt();
    System.out.print("Enter the value of angle c: ");
    c = sc.nextInt();
    if (a + b + c == 180) {
      System.out.println("Triangle is possible.");
      if (a == 90 || b == 90 || c == 90) {
        angle = "right";
      } else if (a < 90 && b < 90 && c < 90) {
        angle = "acute";
      } else if (a > 90 || b > 90 || c > 90) {
        angle = "obtuse";
      }
      System.out.println("Triangle Angle Type: " + angle);
    } else {
      System.out.println("triangle is not possible");
    }
  }
}