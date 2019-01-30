import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        System.out.println(student.getName());
        student.setAge(18);
        System.out.println(student.getAge());
        student.setSex("male");
        System.out.println(student.getSex());
        student.setStudentNumber(63);
        System.out.println(student.getStudentNumber());
    }

}
