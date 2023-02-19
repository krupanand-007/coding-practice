package designpatterns.builder;

public class MainClass {

    public static void main(String[] args) {
        Student student = Student.StudentBuilder.builder()
                .setId(1)
                .setName("Ravi")
                .setCourse("ECE")
                .build();
        System.out.println(student);
    }
}
