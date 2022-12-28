// Write a program to ask user to enter 5 subject's marks and calculate the percentage.
import java.util.Scanner;

public class StudentPercentage {
  public static void main(String[] args) {
    System.out.println("PERCENTAGE CALCULATOR");
    Scanner s = new Scanner(System.in);
    System.out.println("enter marks of English");
    float eng = s.nextFloat();
    System.out.println("enter marks of Maths");
    float math = s.nextFloat();
    System.out.println("enter marks of Science");
    float sci = s.nextFloat();
    System.out.println("enter marks of SST");
    float sst = s.nextFloat();
    System.out.println("enter marks of Hindi");
    float hin = s.nextFloat();
    int total = 500;
    System.out.println("total percentage:");
    float marks = (eng + math + sci + sst + hin);
    System.out.println(marks / total * 100);
  }
}
