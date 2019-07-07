package Min;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            System.out.println(Math.min(Math.min(674, 697), 876));
    }

    public static int min(int a, int b, int c) {

        return Math.min(Math.min(a, b), c);
    }
}

