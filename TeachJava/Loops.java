/*
Loops: While loop, for loop, do while explained
@ Abinet Kenore
May 2020
*/
import java.util.Scanner;
public class Loops
{
  public static void main(String[] args)
  {

    // FOR LOOP
  /*System.out.println("For Loop: \n");
   for(int i = 0; i <= 20; i++)
   {
     System.out.println("Hello, Welcome. ");
   }
  */
//   for(int i = 0; i < 10; i++)
//   {
//     System.out.print(", " + i);
//   }
/*
  System.out.println("Add numbers from 1 to 10: ");
  int sum = 0;
  for (int i = 0; i <= 10 ; i++)
  {
    sum = sum + i; //45
    System.out.println("The Sum of Integers 1 to 10 is : " + sum);
  }
*/

// WHILE LOOP
/*
  System.out.println("\nWhile Loop: \n");
  int count = 0;
  while (count <= 10) //11
  {
    System.out.println("Hello, Welcome");
    count++;
  }
  */

/*
  int sumwhile = 0, i = 1;
  while (i <=10)
  {
    sumwhile = sumwhile + i;
    i++; // incremeting //55
    System.out.println("The Sum of Integers 1 to 10 is : " + sumwhile);
  }
*/
  // DO WHILE LOOP
      System.out.println("Do while loop");
      int sum =0;
      int number;
//  double average = 0;
//  average = sum/?? ; Logical Error
      Scanner input = new Scanner(System.in);
      do
        {
          System.out.println("Enter an int value\n" +
          "The program exits if you Enter 0");
          number = input.nextInt();
          sum += number;
        }
      while (number !=0 );
      System.out.println("The Sum is: " + sum);
      /* Condition statement add from lesson  #AverageTestScore.java
         Objective: How we can biuld up on top of what we'd
       */
        if (sum > 1000)
        {
          System.out.println("You score is out of range, \n" +
                  " We are not able to calculate you Score.");
        }
        else
          {
            System.out.println("The Sum of the score is: " + sum);
            if(sum > 80)
            {
              System.out.println("The Grade is: A");
            }
            else if(sum > 70)
            {
              System.out.println("The Grade is: B");
            }
            else if(sum > 60)
            {
              System.out.println("The Grade is: C");
            }
            else if(sum > 50)
            {
              System.out.println("The Grade is: D");
            }
            else
              System.out.println("The Grade is: F");
          }
  }
}
