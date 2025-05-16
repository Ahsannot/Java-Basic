public class FindFabonachiiSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " "); // 0 1
        for (int i = 2; i < n; i++) {
            c = a + b; // 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13, 8+13=21, 13+21=34, 21+34=55
            System.out.print(c + " ");
            a = b; // 1, 1, 2, 3, 5, 8, 13, 21, 34
            b = c; // 1, 2, 3, 5, 8, 13, 21, 34, 55
        }
    }
}