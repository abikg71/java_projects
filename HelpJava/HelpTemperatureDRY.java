import java.util.*;
/*
@ Abinet Kenore
How to write dry code
global variable  vs static
October 30,2019
*/
public class HelpTemperatureDRY
{
  static double celsius;
  static double fahrenheit;

  static double Fahrenheit;
  static double Celsius;

  public static double celsiusToFahrenheit()
  {
    Fahrenheit = (1.8 * celsius) + 32; // 9/5
    return Fahrenheit;
  }
  public static double FahrenheitTocelsius()
  {
    Celsius = (fahrenheit - 32) / 1.8;
    return Celsius;
  }
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    boolean ch = false;
    while (!ch)
    {
      System.out.println("This a part Help... continued");
      int choose = 0;
      System.out.println("Please choose 1 for C -> F and 2 for " + "F -> C: ");
      choose = input.nextInt();
      switch (choose)
      {
        case 1:
        System.out.println("Enter the Celsius");
        celsius = input.nextDouble();
        System.out.println("Temperature in Fahrenheit is: " + celsiusToFahrenheit());
        break;
        case 2:
        System.out.println("Enter the fahrenheit ");
        fahrenheit = input.nextDouble();
        System.out.println("Temperature in Celsius is: " + celsiusToFahrenheit());
        break;

        default:
        break;
       }

    System.out.println("Another calculation?\n  " + "y / n, press y to continue or any  other key to exit ");

    String YN;
    input.nextLine();
    YN = input.nextLine();
    if (YN.equalsIgnoreCase("y"))
    {
      ch = false;
    }
    else
    {
      ch = true;
      System.out.println("You exited(!).");
    }

  }
 }
} // End of class
