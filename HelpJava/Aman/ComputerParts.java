import java.util.*;

public class ComputerParts
{
  static Scanner input = new Scanner(System.in);
  static int casee = 0;
  static int cputype = 0;
  static int cpuSpeed = 0;
  static int monitorSize = 0;
  static double price = 0.0;


public static void casetype()
    {
      System.out.println(" Please select the Case type you want. \n"
      +  "choose 1 for Full tower  and  2 for Mini tower ");
      casee = input.nextInt();

      if(casee == 1)
      {
        price = 33.44;
        System.out.println("You've choosen Full tower");
        System.out.println("The Price of Full tower case is: " + price);

      }

      else
      price = 20.67;
      System.out.println("You've choosen Mini tower");
      System.out.println("The Price of Full tower case is $$" + price);

    }

    public static void CPUType()
    {
      System.out.println("Select the Type of CPU you want. ");
      System.out.println("CPU casetype we do have are: Please choose 1 for  AMD, \n" + "2 for INTEL ");
      casee = input.nextInt();

      if(cputype == 1)
      {
        price = 200.02;
        System.out.println("You've choosen AMD");
        System.out.println("The Price is $$" + price);

      }

      else
      price = 300.21;
      System.out.println("You've choosen INTEL");
      System.out.println("The Price is $$" + price);

    }

    public static void CPUSpeed(){}

    public static void Monitor(){
      System.out.println("What Monitor size do you want?  ");
      System.out.println("Please choose 1 for 11 inch 2 for 13 inch 3 for 15 inch");
      monitorSize = input.nextInt();

      if(monitorSize == 1)
      {
        price = 100;
        System.out.println("You've choosen 11 inch Monitor");
        System.out.println("The Price is $$" + price);

      }

      else if(monitorSize == 2 )
      {
        price = 133.33;
        System.out.println("You've choosen 13 inch Monitor");
        System.out.println("The Price is $$" + price);

      }

      else
      price = 241.56;
      System.out.println("You've choosen 15 inch ");
      System.out.println("The Price is$$" + price);

    }

    // static double totalPrice =  0.0;
    // totalPrice = price + totalPrice;
    // System.out.println("Total Price of the Computer is " + totalPrice);
}
