/*
* DO NOT edit the code in this file
*/
public class Student 
{
    private String name;
    private String courseName;
    private int grade;
    private double gpa;
    private int numScores;
    private int totalPoints;
/*
*Creates a Student with default values
*/
public Student ()
{
    name = "Student";
    courseName = "Loyola Blakefield: AP CSA";
    grade = 0;
    gpa = 0.0;
    numScores = 0;
    totalPoints = 0;
}
/*
*Creates a Student with the given values
*@param name - Student name
*@param courseName - Course name
*@param grade - current grade in school (numeric)
*/
public Student (String sName, String sClass, int sGrade) 
{
    name = sName;
    courseName = "Loyola Blakefield: " + sClass;
    grade = sGrade;
    gpa = 0.0;
    numScores = 0;
    totalPoints = 0;
}
/*
*@return the name of this Student as a String
*/
public String getName () 
{
    return name;
}
/*
*@return the courseName of this Student as a String
*/
public String getCourse () 
{
    return courseName;
}
/*
*@return the grade of this Student as an int
*/
public int getGrade () 
{
    return grade;
}
/*
*@return the number of scores of this Student as a int
*/
public int getNumScores () 
{
    return numScores;
}
/*
*@return the number of points of this Student as a int
*/
public int getPoints () 
{
    return totalPoints;
}
/*
*sets the name of the Student
*/
public void setName (String sName) 
{
    name = sName;
}
/*
*sets the course name of the Student
*/
public void setCourse (String sCourse) 
{
    courseName = sCourse;
}
/*
*sets the current grade level of the Student
*/
public void setGrade (int sGrade) 
{
    grade = sGrade;
}
/*
*adds a new grade for this Student
*/
public void addScore (int score) 
{
// Increase number of numGrades
    numScores ++;
    // Increase number of totalPoints
    totalPoints = totalPoints + score;
}
}