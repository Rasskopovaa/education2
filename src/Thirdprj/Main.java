package Thirdprj;

    public class Main {
        public static void main (String [] args){

            Teacher teacher= new Teacher();
            teacher.name="Анна Изольдовна";
            teacher.subject="История";


            Students  student= new Students ();
            student.name="Мария";
            student.date="Восемьнадцатое ноября";
            student.topic="История возникновения христианства";
            student.pupil=6;

            teacher.SayHello();
            teacher.TheSubject();
            teacher.AskAboutName(student);
            System.out.println("Меня зовут"+" "+teacher.journal);
            teacher.AskAboutDate(student);
            System.out.println(teacher.journal);
            teacher.AskAboutTopic(student);
            System.out.println(teacher.journal);
            teacher.AskAboutAbsentStudents(student);
            System.out.println("Всего отсутствует " + teacher.journal +" "+ "человек");


        }
    }

