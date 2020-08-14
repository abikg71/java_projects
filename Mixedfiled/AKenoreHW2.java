package akenorehw2;

/**
 *This program uses the classes created in HW #1 as classes and testes the given
 * IO file from the input.
 * This program is to track a students and their grades in various courses.
 * The university needs to track student's first and last name, Id, and email.
 *The university wants the email must include "@" in the email. 
 * @author Abinet Kenore
 * @version 20170207
 * CS2050
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AKenoreHW2
{
    private static Student Student1; 
    private static GradeItem gradeitem;
    private static Student Student2;
    private static GradeItem gradeitem2;
    private static final String filename = "Input/input_hw2input1.txt";
    
    public static void main(String[] args) throws IOException
    {
        System.err.println("-----DISPLAY Message-----   \n"+ "Test Set1:\n");
        
       //This case tests the constructors with parameters for each attributes,-
       //and toString method for each class
       
        Student1 = new Student("900840770","Abinet","Kenore",
                "akenore@msudener.edu");
        
        System.err.println("Test 1a:");
        System.err.println(Student1.toString()+ "\n");
        
        System.err.println("Test 1b:");
        GradeItem grade1; 
        grade1 = new GradeItem(1,"900840770","56234", "HW","20170209", 100,93);
        System.err.println(grade1.toString());
        System.err.println();
        
         try
        {
           
             File textfile = new File(filename);
             Scanner readfile = new Scanner(textfile); 
             String line = readfile.nextLine();
             String [] info= line.split(",");
            //This case tests the constructors & getters, and -
            //reading data from the input file
             if (info[0].equals("STUDENT"))
             {
                
                processStudentInfo(info);
                System.err.println("Running Test 2a:\nStudent Obeject Data");
                System.err.println("Stiudent2 "+ Student2.getId());
                System.err.println("Stiudent2 "+ Student2.getFirstName());
                System.err.println("Stiudent2 "+ Student2.getLastName());
                System.err.println("Stiudent2 "+ Student2.getEmail());
                System.err.println();
                
             }
           
            line = readfile.nextLine();
            info = line.split(",");
            if(info[0].equals("GRADE ITEM"))
            {
               processGradeItem(info); 
               System.err.println("Running Test 2b:\nGrade Item Data");
               System.err.println("GradeItem2 " + gradeitem2.getGradeId());
               System.err.println("GradeItem2 " + gradeitem2.getId());         
               System.err.println("GradeItem2 " + gradeitem2.getCourseID());
               System.err.println("GradeItem2 "  + gradeitem2.getType());
               System.err.println("GradeItem2 "  + gradeitem2.getDate());
               System.err.println("GradeItem2 " + gradeitem2.getMaximuimScore());
               System.err.println("GradeItem2 " + gradeitem2.getActualscore());
               System.err.println();
            
           //This case tests the Equals methods for both classes");
           
           System.err.println("Test 3a:");
           if(Student1.equals( Student2))
               System.err.println("Equal");
           
           else System.err.println("NOt");
           
           System.err.println("Test 3b:");
           if( grade1.equals( gradeitem))
               System.err.println("Equal");
           
           else System.err.println("NOt");
             readfile.close(); 
           }
                   
        }
        
         catch( FileNotFoundException ex)
         {
             System.err.println("Error" + filename + "Not found ");
         }
  } 
    public static void processStudentInfo(String [] info)
    {
        Student2 = new Student (info[2],info[3], info[4], info[5]); 
    }
    public static void processGradeItem(String [] grade)
    {
        gradeitem2 = new GradeItem (Integer.parseInt(grade[2]),grade[3],
        grade[4],grade[5], grade[6],Integer.parseInt(grade[7]),
        Integer.parseInt(grade[8]));
    }           // End of main class
}