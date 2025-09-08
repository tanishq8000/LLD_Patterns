package Prototype_Design_Pattern;

public class DemoPrototype {
    public static void main(String[] args) {
        System.out.println("-------- Prototype Design Pattern ---------");

        Student student = new Student(5,"Ram","CSE",100);
        student.printDetails();

        Student studentClone = (Student) student.clone();
        studentClone.setInHighSchool(true);
        studentClone.printDetails();

        System.out.println("Same Objects? : " + (student == studentClone));
    }
}
