// will you write different methods to solve sum of multiple numbers?
// use this instead.

public class VarArgs {
  static int sum(int ...arr) {
    // availiable as int[]arr;
    int result=0;
    for (int a: arr) {
        result+=a;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(sum(4,6,7,5));
  }
}
