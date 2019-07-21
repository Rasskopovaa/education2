package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Введите операцию:");
        String operation = reader.readLine();
        if (operation.equals("+")) {
            System.out.println("Сумма введенных чисел равна : " + add(x, y));
        } else if (operation.equals("-")) {
            System.out.println("Разность введенных чисел равна: " + sub(x, y));
        } else if (operation.equals("*")) {
            System.out.println("Произведение введенных чисел равно: " + mult(x, y));
        } else if (operation.equals("/")) {
            System.out.println("Деление введенных чиел равно: " + div(x, y));

        }

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
