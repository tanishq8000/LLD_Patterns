package Builder_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects(){
        List<String> mbaSubjectsList = new ArrayList<>();
        mbaSubjectsList.add("Business Management");
        mbaSubjectsList.add("Finance Management");
        mbaSubjectsList.add("Economics");
        this.subjects = mbaSubjectsList;
        return this;
    }
}
