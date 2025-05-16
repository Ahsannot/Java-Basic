public class pattern_2_demo{
    public static void main(String[] args){
        int n = 1;
        for (int i = 5; i >= n; i--) {
            for (int j = i; j >= n; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}