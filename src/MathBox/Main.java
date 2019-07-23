package MathBox;

public class Main {
    public static void main(String[] args) {
        MathBox mathbox = new MathBox();
        mathbox.addDigits(23);
        mathbox.addDigits(12);
        mathbox.addDigits(11);
        mathbox.addDigits(45);
        System.out.println(mathbox.getSumm());
    }


}
