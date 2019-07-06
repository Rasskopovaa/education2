package Thirdprj;

public class Student extends Human {

    public Student(int age, String name, String gender) {
        this.setAge(age);
        this.setName(name);
        this.setGender(gender);


    }

    public String toString() {
        return "Student{" + "name'" + getName() + '\'' + ",age='" + getAge() + '\'' + ",gender='" + getGender() + '\'' +
                '}';
    }
}
