package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Иванович","География");
        Student student = new Student("Петров Петр Петрович");
        teacher.rateStudent(student);
    }
}
