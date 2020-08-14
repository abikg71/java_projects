package Abinet;

import java.io.*;
import java.util.Scanner;

public class Read
{
    public static void main(String[] args) throws Exception
    {

        File read = new File("text.txt");
       Scanner input = new Scanner(read);
       System.out.printf("\n%8s%8s%8s%8s%10S","FirstName","MI","LastName","score", "LetterG");
        while (input.hasNext())
        {
            String  fname = input.next();
            String mi = input.next();
            String lname = input.next();

            int score = input.nextInt();


            if(score <= 0 || score > 100)
            {
                System.out.println("Invalid Score");
            }
           else if(score >= 90)
            {
                System.out.println("A");
            }
          else   if(score >= 80)
            {
                System.out.println("B");
            }
          else   if(score >=70)
            {
                System.out.println("C");
            }
           else  if(score >59)
            {
                System.out.println("D");
            }
           else
               {
                   System.out.println("F");
               }
            System.out.printf("\n%-8s%-8s%-8s%-9s",fname,mi,lname,score);
        }
    }
}
