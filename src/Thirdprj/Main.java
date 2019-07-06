package Thirdprj;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(11, "Jack", "male");
        Student student2 = new Student(12, "Mary", "female");
        Student student3 = new Student(11, "Billy", "male");
        Student student4 = new Student(13, "Lily", "female");
        Student student5 = new Student(11, "Bob", "male");
        Student student6 = new Student(12, "Darsy", "male");
        Student student7 = new Student(11, "Lola", "female");
        Student student8 = new Student(12, "Black", "male");
        Student student9 = new Student(11, "Maya", "female");
        Student student10 = new Student(12, "Archy", "male");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);

        Teacher teacher = new Teacher(list);
        System.out.println(teacher.toString());

        teacher.sayName();
        teacher.sayAge();
        student4.sayName();
        student4.sayAge();

        System.out.println(student4.toString());
    }
}

