
class Person {
    void showRole() {
        System.out.println("I am a person");
    }
}
class Student extends Person {
    void showRole() {
        System.out.println("I am a student");
    }
}

public class Demo5{
    public static void main(String[] args) {
        Person s = new Student();
        s.showRole();  
    }
}

