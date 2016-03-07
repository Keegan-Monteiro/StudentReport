package studentreport;

public class Score {
    private final int Score;
    
    public Score (int Score)
    {
        this.Score = Score;
    }
    
    public int getScore () {return Score;}
    
    public String ScoreToGrade ()
    {
        if (this.Score >= 70)
            return "A";
        else if (this.Score >= 60)
            return "B";
        else if (this.Score >= 50)
            return "C";
        else if (this.Score >= 40)
            return "D";
        else
            return "F";          
    }
    
}
