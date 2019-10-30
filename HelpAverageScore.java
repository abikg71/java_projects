import java.util.Scanner;

public class HelpAverageScore
{
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("This is Average Score Calculating program\n");

  int score1; int score2; int score3;
  System.out.print("Enter score1 ");
  score1 = input.nextInt();
  System.out.print("Enter score2 ");
  score2 = input.nextInt();
  System.out.print("Enter score3 ");
  score3 = input.nextInt();

  double sum = score1 + score2 + score3;
  //double avr = sum/3;
  double avr = (score1 + score2 +score3)/3;
   System.out.println("Your Score sum is " + sum);
   System.out.println("Your AverageScore is " + avr);

   if(90 <= avr && avr <= 100)
   {
     System.out.println("Your Grade is " + " A");
   }
   else if (80 <= avr && avr < 90)
   {
     System.out.println("Your Grade is "  + " B");
   }
   else if (70 <= avr && avr <  80)
   {
     System.out.println("Your Grade is " + " C");
   }
   else
   {
     System.out.println("Your Grade is " + " D");
   }

  }

}
