package domain;

public class Student extends User{
    public Student(String name, int age) {
        super(name, age);
    }
    public void printName(){
        System.out.println(name);

    }
}
