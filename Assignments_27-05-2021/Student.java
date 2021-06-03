package com.ojas.classesobjects;
import java.util.*;
public class Student 
{
    public int studentId;
    public String studentName;
    private int marks;
    private char grade; 

    public Student() 
    {
        System.out.println("Student Grade");
    }

     public Student(int studentId, String studentName, int marks)
     {
    	 this();
    	 this.studentId = studentId;
    	 this.studentName = studentName;
    	 this.marks = marks;
    	 calculateGrade();
    }

    public String displayDetails() 
    {
        String res = "";
        res = "Student [Name = " + studentName + ", Student ID = " + studentId + 
        		", Marks = " + marks + ", Grade =" + grade + "]" ;
        return res;
    }

 

    private void calculateGrade() 
    {        

        if (marks >= 90) 
        {
            grade = 'A';
        } 
        else if (marks < 90 && marks >= 80) 
        {
            grade = 'B';
        }
        else if (marks >= 70 && marks < 80) 
        {
            grade = 'C';
        }
        else if (marks >= 60 && marks < 70) 
        {
            grade = 'D';
        }
        else
        {
            grade = 'E';
        }
        
    } 

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student's No. , Name , Marks : ");
        Student stud = new Student(sc.nextInt(),sc.next(),sc.nextInt());

        System.out.print(stud.displayDetails());
        
    }

 

}