/*
Q.3 Write a program which asks a user
to enter four test score and calculate the average
and display the output on the console.
My draft solution for Q3 on Exercise.txt

@author: Abinet Kenore
@date: April 21, 2020
===============================================
TALK:
    Solution for AOperation Exercise

    Condition Statements Explained
    We will modify the code we wrote last time
    and apply conditional statements to it.
    Nesting if-else statements in if or else statements
    replacing the same and long message with a variables
    About Restricting the ranges.
    Naming Variables and classes (Revised)
    How do we make the user to enter the scores more than once
    to check for different Scores
    And how to to stop it from running.
*/

import java.util.*;
public class AverageTestScore
{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    double testScore1, testScore2,
            testScore3, testScore4, sum, average;
    String grade_score = "Your Grade Score is: ";

    System.out.println("Enter test Score1 ");
    testScore1 = console.nextDouble();
    System.out.println("Enter test Score2 ");
    testScore2 = console.nextDouble();
    System.out.println("Enter test Score3 ");
    testScore3 = console.nextDouble();
    System.out.println("Enter test Score4 ");
    testScore4 = console.nextDouble();

    sum = testScore1 + testScore2 + testScore3 + testScore4;
    average = sum / 4;
    System.out.println("\nYour scores are: " + testScore1 + ", " + testScore2 + ", " + testScore3 + ", " + testScore4);

    // Conditional Statements
    // Letter Grade

    if (sum > 42)
    {
      System.out.println("You score is out of range, \n We are not able to calculate you Score.");
    }
    else
    {
      System.out.println("The Sum of the score is: " + sum + "\nThe average of the score is: " + average);
      if(average > 8.7)
      {
        System.out.println(grade_score+ "A");
      }
      else if(average > 7.5)
      {
        System.out.println(grade_score + "B");
      }
      else if(average > 6.8)
      {
        System.out.println(grade_score + "C");
      }
      else if(average > 5.8)
      {
        System.out.println(grade_score + "D");
      }
      else
        System.out.println(grade_score + "F");
    }

  }
}
