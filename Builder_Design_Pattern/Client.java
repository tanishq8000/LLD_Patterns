package Builder_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistrationDirector enggStudentDirector = new StudentRegistrationDirector(new EngineeringStudentBuilder());
        StudentRegistrationDirector mbaStudentDirector = new StudentRegistrationDirector(new MbaStudentBuilder());

        Student enggStudent = enggStudentDirector.createStudent();
        Student mbaStudent = mbaStudentDirector.createStudent();

        System.out.println("------ ENGINEERING STUDENT DETAILS ------- " + enggStudent.toString());
        System.out.println("------ MBA STUDENT DETAILS -------" + mbaStudent.toString());
    }
}
