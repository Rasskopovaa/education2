package Collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
      /*  List<String> names= new ArrayList<>();
        names.add("Саша");
        names.add("Маша");
        names.add("Даша");
        int i=1;
        for( String name :names) для каждого элемента из Names выполнится след. цикл{
            System.out.println(i + " в списке " + name);
            i++;*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = new ArrayList<>();
        String line;
        while (!(line = reader.readLine()).equals("")) {
            names.add(line);
        }
        int i = 1;
        for (String name : names) {
            System.out.println(i + " в списке " + name);
            i++;
        }
    }
}