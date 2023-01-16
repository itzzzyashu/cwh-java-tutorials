public class triangle_itzzzyashu {
  public static void main(int a, int b, int c) {
    String angle = "";
    if (a + b + c == 180) {
      System.out.println("Triangle is possible.");
      if (a == 90 || b == 90 || c == 90) {
        angle = "right";
      } else if (a < 90 && b < 90 && c < 90) {
        angle = "acute";
      } else if (a > 90 || b > 90 || c > 90) {
        angle = "obtuse";
      }
      System.out.println("Triangle is " + angle + " angled.");
    } else {
      System.out.println("triangle is not possible");
    }
  }
}