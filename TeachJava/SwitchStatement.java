/*
In this class I will solve the Credit Score Exr by using Switch Statements.

@ Abinet Kenore
May 1, 2020
*/
import java.*;

public class SwitchStatement
{
  public static void main(String[] args)
  {
    Scanner console = Scanner(System.in);
    int score;
    String cs_msg = "Your Cerdit Score is: ";
    String talk_banker = "Talk to Your Banker. ";

    System.out.println("Welcome to Credit Score Program.\nPlease Enter your CScore.");
    score = console.nextInt();
    boolean choice = false;
    switch (score)
    {
      case 1:
      score > 800 && score < 900;
      System.out.println("E");
      break;
      case 2:
      score > 700 && score < 800;
      System.out.println("VG");
      break;
      case 3:
      score < 700;
      System.out.println("G");
      break;
      case 4:
      score < 600 ;
      System.out.println("P");
      break;
      default:
    System.out.println("Talk to Your Banker. ");

    }


  }

}
