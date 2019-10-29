/*Conversion between F<->C
October 29, 2019
@ Abinet Kenore
The purpose of this project is tell help my dear friends who are
 beginning java
 * on this part I added while loop which promts yes or no option either to continue or not.
 => Challenge
 c = 4.44
f = 39.992000000000004 how to round??
 */

import java.util.Scanner;
public class HelpTemperature2
{
  // write kelvin to celius and kelvin to fahrenheit and modify the programm
    public static double  celsiusToFahrenheit(double celius)
    {
        double f = (9.0/5.0) * celius + 32;
        return f;
    }

    public static double FahrenheitTocelsius(double fahrenheit)
    {
        double c = (5.0/9.0) * (fahrenheit - 32);
        return  c;
    }

    public static void main(String[] args) //Main
    {
        Scanner input = new Scanner(System.in);
        boolean ch = false;
        while(!ch ) {
            System.out.println("This a part Help... continued");
            int choose = 0;
            System.out.println("Please choose 1 for C -> F and 2 for " +
                    "F -> C: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter the celius");
                    double celius = input.nextDouble();
                    System.out.println(celsiusToFahrenheit(celius));
                    break;

                case 2:
                    System.out.println("Enter the fahrenheit ");
                    double fahrenheit = input.nextDouble();
                    System.out.println(celsiusToFahrenheit(fahrenheit));
                    break;

                default:
                    break;
                  }
                System.out.println("Another calculation?\n  " +
                        "y / n, press y to continue or any "
                        + "other key to exit ");
                String YN;
                input.nextLine();
                YN = input.nextLine();
                if(YN.equalsIgnoreCase("y"))
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
