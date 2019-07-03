package Thirdprj;

public class Teacher {
    public String name;
    public String subject;
    public String journal;

    public void SayHello() {
        System.out.println("Добрый день,ребята." + "Меня зовут-" + name);
    }

    public void TheSubject() {
        System.out.println("Я преподаю предмет" + " " + subject);
    }
    public void AskAboutName(Students student){
        System.out.println("Назови своё имя,пожалуйста.");
        journal = student.MyNameIs();
    }
    public void AskAboutDate(Students student){
        System.out.println("Какая сегодня дата?");
        journal= student.TheDateOfToday();
    }
    public void AskAboutTopic(Students student){
        System.out.println("Какая тема сегодняшнего урока?");
        journal=student.TheTopicOfLesson();
    }
    public void AskAboutAbsentStudents(Students student){
        System.out.println("Сколько отсутвует человек?");
        journal= student.absentStudents()+"";
    }

}
