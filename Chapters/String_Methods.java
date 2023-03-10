public class String_Methods {
    public static void main(String[] args) {
        // String name = new String("Harry");
        //str index -  012345
        String name = "Harry";
        //lastIndex - 543210
        String nonTrimmedString = "   Trimmed String   ";
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        // %d - format specifier,
        // used for double,
        // %f for floats,
        // %c for char,
        // %s for string.
        System.out.printf("%d / %f", a,b);
        // or
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
        System.out.println(name.indexOf("r", 3));
        System.out.println(name.lastIndexOf("rry", 4));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HaRrY"));
        System.out.println("Hello this is a \"Backslash squence character\"");
        System.out.println("Hello \t Tab");
        System.out.println("Hello \n NewLine");
    }
}
