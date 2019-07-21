package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        float x = Float.parseFloat(reader.readLine());
        System.out.println("Введите второе число:");
        float y = Float.parseFloat(reader.readLine());
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

    public static void add(float x, float y) {
        System.out.println(x + y);
    }

    public static void sub(float x, float y) {
        System.out.println(x - y);
    }

    public static void mult(float x, float y) {
        System.out.println(x * y);
    }

    public static void div(float x, float y) {
        if (y == 0) {
            System.out.println("Деление на ноль запрещено");
        } else
            System.out.println(x / y);

    }
    }
