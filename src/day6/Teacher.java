package day6;

import java.util.Random;

public class Teacher {
    private String fio;

    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void rateStudent(Student student){
        Random random = new Random();
        int grade = random.nextInt(3)+2;
        String gradeMessege = "";
        switch (grade){
            case 2:
                gradeMessege = "неудовлетворительно";
                break;
            case 3:
                gradeMessege = "удовлетворительно";
            case 4:
                gradeMessege = "хорошо";
            case 5:
                gradeMessege = "отлично";
        }
        System.out.println("Преподователь "+this.fio+"оценил студента с именем "+student.getFio()+" по предмету "+this.subject+" на "+gradeMessege);
    }
}
