package designpatterns.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        StudentRegistry studentRegistry = new StudentRegistry();
        Student student = new Student();
        student.setId(1);
        student.setName("Ramesh");
        student.setInstructor("Sandeep");
        student.setBatch("DEC 22");

        studentRegistry.save("student", student);

        Student studentClone = studentRegistry.getStudent("student").clone();
        studentClone.setId(2);
        studentClone.setName("Suresh");

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setId(3);
        intelligentStudent.setIq(10);
        intelligentStudent.setName("Viswa");
        //studentRegistry.save("Intel", intelligentStudent);

        IntelligentStudent intelStudentClone = intelligentStudent.clone();
        System.out.println(studentClone);
        System.out.println(intelStudentClone);
    }
}
