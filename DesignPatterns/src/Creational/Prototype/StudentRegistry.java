package Creational.Prototype;

import java.util.HashMap;

public class StudentRegistry {

    public HashMap<String, StudentPrototype> studentPrototypeList;

    public HashMap<String, StudentPrototype> getStudentPrototypeList() {
        return studentPrototypeList;
    }

    public StudentRegistry() {
        this.studentPrototypeList = new HashMap<>();
        studentPrototypeList.put("Nov22", new Student("Nov22"));
        studentPrototypeList.put("Dec23", new Student("Dec23"));
        studentPrototypeList.put("Jan24", new Student("Jan24"));
    }
}
