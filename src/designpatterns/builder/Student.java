package designpatterns.builder;

public class Student {

    private int id;
    private String name;
    private String course;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    private Student() {
    }

    private Student(StudentBuilder student) {
        this.id = student.id;
        this.name = student.name;
        this.course = student.course;
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private String course;

        public static StudentBuilder builder() {
            return new StudentBuilder();
        }

        public Student build() {
            //validations here
            return new Student(this);
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }
    }

}
