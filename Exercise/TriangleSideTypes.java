import java.util.Scanner;
import java.lang.Math;
public class TriangleSideTypes {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side length a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of side length b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of side length c: ");
        c = sc.nextInt();
        String type = "";
        if(a==b&&b==c&&c==a){
            type="Equilateral";
        } else if (a==b||b==c||c==a){
            type="Isoscales";
        } else if (a!=b&&b!=c&&c!=a){
            type="Scalane";
        }
        double s = (a+b+c)/2; // (10+10+10)/2 = 15
        System.out.println("Triangle Side Type:  " + type); // Equilateral
        System.out.println("Triangle Parimeter:  " + (a+b+c)); // 10+10+10 = 30
        System.out.println("Triangle Area:       " + Math.sqrt(s*(s - a)*(s - b)*(s - c)));// (15(15-10)(15-10)(15-10)) = 43.3012701892        
      }
}
