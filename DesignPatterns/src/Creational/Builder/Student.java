package Creational.Builder;

final class Student {
    int rollNo;
    int age;
    String name;

    public Student(Builder b) {
        this.age = b.age;
        this.name = b.name;
        this.rollNo = b.rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        int rollNo;
        int age;
        String name;

        public static Builder newInstance()
        {
            return new Builder();
        }

        public Student build() {
            return new Student(this);
        }

        public int getRollNo() {
            return rollNo;
        }

        public Builder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    }
}
