package Min;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)
            System.out.println(min(343, 434, 634));
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }

    }
}

