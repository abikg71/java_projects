
// import java.util.Random;
// import java.Date;
import java.util.*;
public class HelpRandom
{
  public static void main(String[] args)
  {
    Date today = new Date();
    Random rdm = new Random();
    double rdm1 = rdm.nextDouble();
    double rdm2 = rdm.nextDouble();
    double rdm3 = rdm.nextDouble();
    String dash = "--------------------------------\n";

    System.out.println("Today is: \n" + today);
    System.out.print(dash);
    System.out.println("The ff are randomly generated: ");

    double sum  = rdm1 + rdm2 + rdm3;
    double avr = sum/3;

    for(int i = 0; i < 5; i++)
    {
      System.out.print(rdm.nextInt(100) + " ");
    }

    System.out.print("\n" + dash + "Values assigned for: \n");
    System.out.println("Random1 is " + rdm1);
    System.out.println("Random2 is " + rdm2);
    System.out.println("Random3 is " + rdm3);
    System.out.print(dash);

    System.out.println("Random Sum is  is " + sum);
    System.out.println("Random average is  is " + avr);
    System.out.print("After 2 Decimal place is\n ");
    System.out.print(dash);
    System.out.printf("Random Sum is  is %.2f",sum);
    System.out.printf("\nRandom average is %.2f",avr);
  }
}
