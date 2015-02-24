
/**
 * Write a description of class StudentGrades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentGrades
{
    public String student_name;
    public double student_grade;

    /**
     * Constructor for objects of class StudentGrades
     */
    public StudentGrades(String student_name, double student_grade)
    {
        // initialise instance variables
        this.student_name  = student_name;
        this.student_grade = student_grade;
    }
    
    //public String toString()
    //{
        //return student_name; 
    //}
    
    public String getStudentName()
    {
        return student_name;
    }
    
    public double getStudentGrade()
    {
        return student_grade;
    }
}
