public class IfReverseAString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) { // str.length() = 5 - 1 = 4 (H, e, l, l, o) 
            reversedStr = reversedStr + str.charAt(i); // reversedStr = "" + str.charAt(4) = "o" + str.charAt(3) = "ol" + str.charAt(2) = "oll" + str.charAt(1) = "olle" + str.charAt(0) = "olleH"
        }
        System.out.println("Reversed String is: " + reversedStr);
    }
}