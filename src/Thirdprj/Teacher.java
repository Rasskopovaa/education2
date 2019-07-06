package Thirdprj;

import java.util.List;

public class Teacher extends Human {

    List<Student> studentsList;

    public Teacher(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public void sayName() {
        System.out.println("My name is Maria Ivanovna.");
    }

    @Override
    public void sayAge() {
        System.out.println("I'm 35 years old.");
    }

    @Override
    public String toString() {
        return "Teacher{" + "studentsList=" + studentsList + '}';
    }
}
