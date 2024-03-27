package Creational.Prototype;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        HashMap<String, StudentPrototype> studentPrototypeHashMap = studentRegistry.getStudentPrototypeList();
        StudentPrototype student1 = studentPrototypeHashMap.get("Nov22").clone();
        System.out.println(student1.hashCode());
        System.out.println(studentPrototypeHashMap.get("Nov22").hashCode());
    }
}
