public class StringMethods {
    public static void main(String[] args) {
        //   index -   012345
        String name = "Harry";
        
        // String name = new String("Harry");
        // System.out.println(name);
        // int a = 6;
        // float b = 5.6454f;
        // %d - format specifier,
        // used for double,
        // %f for floats,
        // %c for char,
        // %s for string.
        // System.out.printf("The values of a is %d and value of b is %f", a,b);
        // or
        // System.out.format("The values of a is %d and value of b is %f", a,b);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nonTrimmedString = "     Trimmed String   ";
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("r", "p"));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(4));

    }
}
