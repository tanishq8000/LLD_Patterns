package Prototype_Design_Pattern;

public class Student implements StudentPrototype{
    int id;
    String name;
    String branch;
    boolean inHighSchool;
    private int rollno;

    Student(){

    }

    Student(int id,String name,String branch,int rollno){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
    }

    public void setInHighSchool(boolean inHighSchool) {
        this.inHighSchool = inHighSchool;
    }

    @Override
    public StudentPrototype clone(){
        return new Student(id,name,branch,rollno);
    }

    public void printDetails() {
        System.out.println("=== Student Details ===");
        System.out.print(this + ": ");
        System.out.println("Id: " + id + ", Name: " + name + ", Branch: " + branch + ", Roll No: " + rollno + ", In High School: " + inHighSchool);
    }

}
