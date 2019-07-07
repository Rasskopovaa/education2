package Min3;

public class Main {
    public static void main(String[] args) {
        System.out.println(min(34, 65));
        System.out.println(min(34, 65, 87, 88));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c, int d) {
        return (min(a, b) > c && (c < d) ? c : min(a, b) > d && d < c ? d : min(a, b));
    }
}