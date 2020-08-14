/*
@ Abinet Kenore
How to write dry code
global variable  vs static
October 30,2019
*/

import java.util.*;

public class Teachdatatype3
{
  //place holders for the information which we pass.

    static double celsius;
    static double fahrenheit;
    static double Fahrenheit;
    static double Celsius;
//https://www.geeksforgeeks.org/variables-in-java/

    public static double celsiusToFahrenheit()
    {
        Fahrenheit = (1.8 * celsius) + 32; // 9/5
        return Fahrenheit;
    }

    public static double FahrenheitTocelsius()
    {
        Celsius = (fahrenheit - 32) * 5/9;
        return Celsius;
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        String favColor;
        String animal;
        Random rand = new Random();
        int rand_int3 = rand.nextInt(100);


        // Prompt the User to Enter the information
        System.out.println("Enter your FN");
        firstName = input.nextLine();

        System.out.println("Enter your LN");
        lastName = input.nextLine();

        System.out.println("Enter your Favoite Color");
        favColor = input.nextLine();

        System.out.println("Enter your age");
        age  = input.nextInt();
        System.out.println("Enter your fabrive animal");
        animal = input.nextLine();

        System.out.println("Tirst like "  + animal + favColor);

        // Display out Info
        System.out.println("Hello" + firstName + " " + lastName );
        System.out.print("your Favorite Color is : " + favColor);
        System.out.println("Your are : "  + age );

       // System.out.println("Your user name is: " + firstName + lastName);
       // System.out.println("your user name is : " + firstName+ lastName.charAt(2) + rand.nextInt());
       // System.out.println("your user name is : " + firstName+ lastName.substring(0,3) + rand.nextInt());


        System.out.println("your user name is : " + firstName.toLowerCase() +
                lastName.toLowerCase().charAt(2) + rand_int3);

        boolean ch = false;
        while (!ch)
        {
            System.out.println("This a part Help... continued");
            int choose;
            System.out.println("Please choose 1 for C -> F and 2 for " + "F -> C: ");
            choose = input.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.println("Enter the Celsius");
                    celsius = input.nextDouble();
                    System.out.println("Temperature in Fahrenheit is: " + celsiusToFahrenheit());

                    double normalTemf = 98.0;
                    if(fahrenheit > normalTemf)
                    {
                        System.out.println("You need to see a doctor bc your body temperature is :"
                                + normalTemf );
                    }
                    break;

                case 2:
                    System.out.println("Enter the fahrenheit ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Temperature in Celsius is: " + FahrenheitTocelsius());

                    double normalTemc = 37.0;
                    if(celsius > normalTemc)
                    {
                        System.out.println("You need to see a doctor bc your body temperature is  :" + normalTemc );
                    }
                    break;

                default:
                    break;
            }

            System.out.println("Another calculation?\n  " +
                    "y / n, press y to continue or any  other key to exit ");

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
        } //End of While
    }
}
