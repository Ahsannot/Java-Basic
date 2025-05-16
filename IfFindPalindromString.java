public class IfFindPalindromString {

    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        if (str.equals(reversedStr)) {
            System.out.println( str + " String is Palindrom");
        } else {
            System.out.println(str + " String is not Palindrom");
        }
    }
}