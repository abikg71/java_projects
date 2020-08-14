import java.util.Scanner;

public class Teachdatatype2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        double far;
        double cel;

        System.out.println("Teachdatatype Continued");
        System.out.println("Enter Your Name: ");
        name = input.nextLine();
        System.out.println("Enter your body temprature in Celsius");
        cel = input.nextDouble();

        far = cel * 9/5 + 32;
        System.out.println("Your body Temprature in Fahrenheit is : " + far );

        //[°C] = ([°F] − 32) × ​5⁄9

    }
}
