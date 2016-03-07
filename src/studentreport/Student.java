package studentreport;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String Name;
    private final Map<Subject, Score> subjectGrades = new HashMap<Subject, Score>();
    private final Map<String, Integer> gradeCount = new HashMap<String, Integer>();

    public String getStudent () {return Name;}
    public Student (String studentName) {this.Name = studentName;}
    
    public Map<Subject, Score> getGrades() {return subjectGrades;}
    public void setSubjectGrade (String subject, int score) {
        subjectGrades.put(Subject.valueOf(subject.toUpperCase()), new Score(score));
        setGradeCount(subjectGrades.get(Subject.valueOf(subject.toUpperCase())).ScoreToGrade());
    }
    
    public void setGradeCount(String StringGrade) {
        if (gradeCount.containsKey(StringGrade))
            gradeCount.put(StringGrade, gradeCount.get(StringGrade) + 1);
        else
            gradeCount.put(StringGrade, 1);
    }
    public Map<String,Integer> getGradeCount() {return gradeCount;}
}
