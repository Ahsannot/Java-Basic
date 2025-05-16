public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Length: " + str.length());
        System.out.println("charAt(1): " + str.charAt(1));
        System.out.println("substring(1, 4): " + str.substring(1, 4));
        System.out.println("equals(\"Hello\"): " + str.equals("Hello"));
        System.out.println("equalsIgnoreCase(\"hello\"): " + str.equalsIgnoreCase("hello"));
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("contains(\"ll\"): " + str.contains("ll"));
        System.out.println("replace('l', 'x'): " + str.replace('l', 'x'));

        String messy = "  Hello  ";
        System.out.println("trim(): [" + messy.trim() + "]");

        System.out.println("indexOf(\"l\"): " + str.indexOf("l"));
        System.out.println("lastIndexOf(\"l\"): " + str.lastIndexOf("l"));

        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("First word after split: " + words[0]);

        System.out.println("startsWith(\"He\"): " + str.startsWith("He"));
        System.out.println("endsWith(\"lo\"): " + str.endsWith("lo"));

        String emptyStr = "";
        System.out.println("isEmpty(): " + emptyStr.isEmpty());

        String blankStr = "   ";
        System.out.println("isBlank() (manually using trim): " + blankStr.trim().isEmpty());

        char[] chars = str.toCharArray();
        System.out.println("First char: " + chars[0]);
    }
}
