package MathBox;

import java.util.ArrayList;
import java.util.List;

public class MathBox {
    private List digits = new ArrayList();

    public void addDigits(Object digit) {
        digits.add(digit);
    }

    public int getSumm() {
        int summ = 0;
        for (Object digit : digits) {
            summ += (int) digit;
        }
        return summ;
    }
}
