public class StringMethods {
    public static void main(String[] args) {
        //str index -  012345
        String name = "Harry";
        //lastIndex - 543210
        String nonTrimmedString = "     Trimmed String   ";
        // String name = new String("Harry");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        // %d - format specifier,
        // used for double,
        // %f for floats,
        // %c for char,
        // %s for string.
        System.out.printf("%d / %f", a,b);
        or
        System.out.format("%d / %f", a,b);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("r", "p"));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("y"));
        System.out.println(name.indexOf(3, "r"));
        System.out.println(name.lastIndexOf("rry", 4));
        System.out.println(name.equals("Harry"));
    }
}
