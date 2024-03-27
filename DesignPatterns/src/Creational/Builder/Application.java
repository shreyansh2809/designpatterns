package Creational.Builder;

public class Application {
    public static void main(String[] args) {
        Student s1 = Student.Builder.newInstance().setAge(12).setName("Mayank").setRollNo(121615).build();
        Student s2 = Student.Builder.newInstance().setAge(13).setName("Ayush").setRollNo(121313).build();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
