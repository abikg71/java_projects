
/*Conversion between F<->C
October 29, 2019
@ Abinet Kenore
The challenge is taken from Introduction to Java programming 8ed by Y.Daniel Liang chapter 5, exerice 5.8 (p # 190)
The purpose of this project is tell help my dear friends who are
 beginning java
*/

import java.util.Scanner;
public class HelpTemperature
{
    public static double  celsiusToFahrenheit(double celsius)
    {
        double f = (1.8 * celsius) + 32; // 9/5
        return f;
    }

    public static double FahrenheitTocelsius(double fahrenheit)
    {
        double c =  (fahrenheit - 32) / 1.8;
        return  c;
    }

    public static void main(String[] args) //Main
    {
        Scanner input = new Scanner(System.in);
        int choose = 0;
        System.out.println("Please choose 1 for C -> F and 2 for F -> C: ");
        choose = input.nextInt();
        switch (choose)
        {
            case 1:
            System.out.println("Enter the Celsius");
            double celsius= input.nextDouble();
            System.out.println( "Temperature in Fahrenheit is: " + celsiusToFahrenheit(celsius));
            break;

            case 2:
                System.out.println("Enter the fahrenheit ");
                double fahrenheit = input.nextDouble();
                System.out.println("Temperature in Celsius is: " + celsiusToFahrenheit(fahrenheit));
                break;

            default:
                break;
        }
    }
} // End of class
