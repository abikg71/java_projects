/*
Credit Score Displayer
@author: Abinet Kenore
Date: Apr 21, 2020
Use While loop to strict the range 300 to 900. (?)
TALK:
    replacing the same and long message with a variables
    Nesting if-else statements in if or else statements
    About Restricting the ranges.
*/

import java.util.*;

public class CreditScore
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int score;
    String cs_msg = "Your Cerdit Score is: ";
    String talk_banker = "Talk to Your Banker. ";

    System.out.println("Welcome to Credit Score Program.\nPlease Enter your CScore.");
    score = input.nextInt();
    boolean choice = false;
    while(!choice)
    {
      if(score < 300 || score >900)
      {
        System.out.println("Your Score is out of range, so \n" + talk_banker );
      }
      else
        {
          System.out.println("Let me Tell in what range you are in.\n " +
                  "==================================== ");
          if (score < 500)
          {
            System.out.println(cs_msg + score + "\nPoor.");
          }
          else if (score < 670)
          {
            System.out.println(cs_msg + score + "\nFair.");
          }
          else if (score < 740)
          {
            System.out.println(cs_msg + score + "\nGood.");
          }
          else if (score < 800)
          {
            System.out.println(cs_msg + score + "\nVery Good.");
          } else if (score > 800)
          {
            System.out.println(cs_msg + score + "\nExellent .");
          }
          else
            {
              System.out.println(cs_msg + score + " Something is wrong.\n " + talk_banker);
            }
        }

      System.out.println("Check outher CS ?\n  y / n, press y to continue or any "
              + "other key to exit ");
      String YN;
      input.nextLine();
      YN = input.nextLine();
      if (YN.equalsIgnoreCase("y"))
      {
        choice = false; //Continuiation
        System.out.println("Welcome to Credit Score Program.\nPlease Enter your CScore.");
        score = input.nextInt();
      }
      else
        {
          choice = true;
          System.out.printf("Thanks for Using Our Application.");
        }
    }
  }// main
}
