package studentreport;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String Name;
    private final Map<Subject, Score> subjectScores = new HashMap<Subject, Score>();

    public String getStudent () {return Name;}
    public Student (String studentName) {this.Name = studentName;}
    
    public Map<Subject, Score> getGrades() {return subjectScores;}
    public void setSubjectGrade (String subject, int score) {
        subjectScores.put(Subject.valueOf(subject.toUpperCase()), new Score(score));
    }
    
    public Map<String,Integer> getGradeCount() {
        Map<String, Integer> gradeCount = new HashMap<String, Integer>();
        
        for (Map.Entry<Subject, Score> entry : subjectScores.entrySet()) {
            Subject Key = entry.getKey();
            Score Value = entry.getValue();
            String Grade = Value.ScoreToGrade();
            
            if (gradeCount.containsKey(Grade))
                gradeCount.put(Grade, gradeCount.get(Grade) + 1);
            else
                gradeCount.put(Grade, 1);
        }
        
        return gradeCount;
    }
}
