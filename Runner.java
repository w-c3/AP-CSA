/*
Name: Will Coyne
Date: October 19 2023
What program does: Prints out student GPA

*/

public class Runner
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student ("James", "English", 12);
        Student student4 = new Student("Andreyw", "Spanish", 10);
        System.out.println("Initial Contents of Objects \n--------------------------\n");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Course: " + student1.getCourse());
        System.out.println("Student Grade: " + student1.getGrade());
        System.out.println("Number of Scores/Total Points: " + student1.getNumScores() + "/" + student1.getPoints());
        System.out.println();
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Course: " + student2.getCourse());
        System.out.println("Student Grade: " + student2.getGrade());
        System.out.println("Number of Scores/Total Points: " + student2.getNumScores() + "/" + student2.getPoints());
        System.out.println();
        System.out.println("Student Name: " + student3.getName());
        System.out.println("Student Course: " + student3.getCourse());
        System.out.println("Student Grade: " + student3.getGrade());
        System.out.println("Number of Scores/Total Points: " + student3.getNumScores() + "/" + student3.getPoints());
        System.out.println();
        System.out.println("Student Name: " + student4.getName());
        System.out.println("Student Course: " + student4.getCourse());
        System.out.println("Student Grade: " + student4.getGrade());
        System.out.println("Number of Scores/Total Points: " + student4.getNumScores() + "/" + student4.getPoints());
        System.out.println();
        
        student1.addScore(10);
        student1.addScore(50);
        
        student2.addScore(80);
        student2.addScore(40);
        student2.addScore((int)((Math.random()*31)+70));
        student2.addScore((int)((Math.random()*31)+70));
        
        student3.addScore((int)((Math.random()*61)+40));
        student3.addScore((int)((Math.random()*61)+40));
        student3.addScore((int)((Math.random()*61)+40));
        
        student4.addScore((int)((Math.random()*100)+1));
        student4.addScore((int)((Math.random()*100)+1));
        student4.addScore((int)((Math.random()*100)+1));
        
        System.out.println("Altered Contents of Objects \n----------------------------\n");
        
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Course: " + student1.getCourse());
        System.out.println("Student Grade: " + student1.getGrade());
        System.out.println("Student has " + student1.getPoints() + " total points from " + student1.getNumScores() + " for a GPA of " + ((double)(student1.getPoints()/student1.getNumScores())));
        System.out.println();
        
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Course: " + student2.getCourse());
        System.out.println("Student Grade: " + student2.getGrade());
        System.out.println("Student has " + student2.getPoints() + " total points from " + student2.getNumScores() + " for a GPA of " + ((double)(student2.getPoints()/student2.getNumScores())));
        System.out.println();
        
        System.out.println("Student Name: " + student3.getName());
        System.out.println("Student Course: " + student3.getCourse());
        System.out.println("Student Grade: " + student3.getGrade());
        System.out.println("Student has " + student3.getPoints() + " total points from " + student3.getNumScores() + " for a GPA of " + ((double)(student3.getPoints()/student3.getNumScores())));
        System.out.println();
        
        System.out.println("Student Name: " + student4.getName());
        System.out.println("Student Course: " + student4.getCourse());
        System.out.println("Student Grade: " + student4.getGrade());
        System.out.println("Student has " + student4.getPoints() + " total points from " + student4.getNumScores() + " for a GPA of " + ((double)(student4.getPoints()/student4.getNumScores())));
        System.out.println();
    }
}