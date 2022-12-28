public class Loops {
    public static void main(String[] args) {
        // While Loop
        int w=1;
        System.out.print("While Loop ");
        while (w<=10) {
            System.out.print(w+" ");
            w++;
        }
        System.out.println("");
        
        // Do-While Loop
        int d = 1;
        System.out.print("Do-While Loop ");
        do {
            System.out.print(d+" ");
            d++;
        } while (d<=10);
        System.out.println("");

        // For Loop
        System.out.print("For Loop ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}