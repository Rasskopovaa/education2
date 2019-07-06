package Thirdprj;


public class Human {
    private int age;
    private String name;
    private String gender;

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sayName() {
        System.out.println("My name is" + " " + getName());
    }

    public void sayAge() {
        System.out.println("I'm" + " " + age + "years old");
    }
}
