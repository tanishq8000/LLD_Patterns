package Builder_Design_Pattern;

public class StudentRegistrationDirector {
    StudentBuilder studentBuilder;
    public StudentRegistrationDirector(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MbaStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1) // EngineeringStudentBuilder
                .setAge(22)
                .setName("Ram")
                .setFatherName("Shyam")
                .setMotherName("Sita")
                .setBranch("Computer Science and Engineering")
                .setSubjects()
                .build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2) // MBAStudentBuilder
                .setAge(24)
                .setName("Ramesh")
                .setFatherName("Suresh")
                .setMotherName("Geeta")
                .setBranch("Business Administration")
                .setSubjects() // MBA-specific method
                .setMobileNo("9876543210")
                .setEmailId("Ramesh@iitb.com")
                .build();
    }

}
