package studentreport;

import java.util.HashMap;
import java.util.Map;

public class Test {
    private final Subject TestSubject;
    private final Map<Student, Score> StudentGrade = new HashMap<Student, Score>();
    
    public Subject getSubject () {return TestSubject;}
    public Test (String subject) {
        TestSubject = Subject.valueOf(subject.toUpperCase());
    }
    
    public Map<Student, Score> getStudents() {return StudentGrade;}
    public void setStudentGrade (Student student, int score) {
        StudentGrade.put(student, new Score(score));
    }
}
