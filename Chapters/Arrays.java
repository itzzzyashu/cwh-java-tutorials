public class Arrays {
  public static void main(String[] args) {
    int[] marks = new int[5];
    // float[] marks2 = {100.8f, 70.5f, 80.5f, 90.56f, 50.7f};
    // String[] marks2 = {"Harry", "Rohan", "Shubham", "Lovish"};
    marks[0] = 100;
    marks[1] = 60;
    marks[2] = 70;
    marks[3] = 90;
    marks[4] = 80;

    // int[] marks = {100, 70, 80, 90, 50};
    System.out.println(marks[4]);
    System.out.println(marks.length);

    // For Loop for displaying array.
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i]);
    }

    // ForEach Loop for displaying array.
    for (int element : marks) {
      System.out.println(element);
    }

    // Multi dimensional Arrays
    int[][] flats; // A 2D Array
    flats = new int[2][3];
    flats[0][0] = 101;
    flats[0][1] = 102;
    flats[0][2] = 103;
    flats[1][0] = 201;
    flats[1][1] = 202;
    flats[1][2] = 203;

     // For Loop for displaying 2D array.
     for (int i = 0; i < flats.length; i++) {
      for (int x = 0; x < flats[i].length; x++) {
        System.out.print(flats[i][x]);
        System.out.print(" ");
      }
      System.out.println("\n");
    }
  }
}
