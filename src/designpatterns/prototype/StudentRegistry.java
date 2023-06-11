package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentMap;

    public StudentRegistry() {
        studentMap = new HashMap<>();
    }

    public void save(String type, Student student) {
        studentMap.put(type, student);
    }

    public Student getStudent(String key) {
        return studentMap.get(key);
    }
}
