// If a class has multiple methods having same name but different in parameters,
// it is known as Method Overloading.

public class MethodOverloading {
  // Hava nothing to return? use void keyword.
  static void tellJoke() {
    System.out.println("I am a joke");
  }

  // Pass the reference not the array.
  static void changeint(int x){
    x=95;
  }

  static void changearr(int[] arr){
    arr[0]=98;
  }

  static void foo(){
    System.out.println("Gummie babe");
  }
  static void foo(String a){
    System.out.printf("Gummie "+a+"!");
  }

  public static void main(String[] args) {
    // using void keyword, nothing to return
    tellJoke();

    // Cannot change the intege
    int x = 45;
    changeint(x);
    System.out.println(x);

    // Can change the array value
    int [] marks = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
    changearr(marks);
    System.out.println(marks[0]);

    // Method Overloading
    foo();
    foo("daddy");
  }
}
