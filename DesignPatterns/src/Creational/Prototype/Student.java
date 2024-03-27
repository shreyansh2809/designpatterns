package Creational.Prototype;

public class Student implements StudentPrototype{
    int age;
    int rollNo;
    String name;

    String batch;

    public Student(Student s) {
        this.age = s.age;
        this.name = s.name;
        this.rollNo = s.rollNo;
    }

    public Student(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public StudentPrototype clone() {
        return new Student(this);
    }

}
