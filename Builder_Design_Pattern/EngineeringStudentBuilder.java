package Builder_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects(){
        List<String> enggSubjectLists = new ArrayList<>();
        enggSubjectLists.add("Operating Systems");
        enggSubjectLists.add("DBMS");
        enggSubjectLists.add("Data Structures and Algorithms");
        this.subjects = enggSubjectLists;
        return this;
    }
}
