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
        System.out.println("Ответ:");
        switch (operation) {
            case "+":
                add(x, y);
                break;
            case "-":
                sub(x, y);
                break;
            case "*":
                mult(x, y);
                break;
            case "/":
                div(x, y);
                break;
            default:
                System.out.println("Нераспознанная операция");
        }

    }

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void sub(int x, int y) {
        System.out.println(x - y);
    }

    public static void mult(int x, int y) {
        System.out.println(x * y);
    }

    public static void div(int x, int y) {
        if (y == 0) {
            System.out.println("Деление на ноль запрещено");
        } else
            System.out.println(x / y);

    }
    }
