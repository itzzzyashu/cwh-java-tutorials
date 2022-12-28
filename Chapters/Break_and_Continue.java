public class Break_and_Continue {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      if (i == 2) {
        // System.out.println("Ending the loop");
        continue; // continuosly moves to the next iteration but
        // skip the code below loop on mentioned conditon in if(i==2).
        // break; // breaks the loop
      }
      System.out.println("Loops ends here");
    }
  }
}
