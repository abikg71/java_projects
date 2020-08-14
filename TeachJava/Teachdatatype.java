import java.util.Random;
import java.util.Scanner;

public class Teachdatatype {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        // Variable Declared
        String firstName;
        String lastName;
        int age;
        String favColor;
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);

        // Prompt the User to Enter the information

        System.out.println("Enter your FN");
        firstName = console.nextLine();

        System.out.println("Enter your LN");
        lastName = console.nextLine();

        System.out.println("Enter your Favoite Color");
        favColor = console.nextLine();

        System.out.println("Enter your age");
        age  = console.nextInt();

        // Display out Info

        System.out.println("Hello" + firstName + " " + lastName );
        System.out.print("your Favorite Color is : " + favColor);
        System.out.println("Your are : "  + age );

        System.out.println();
        System.out.println("your user name is : " + firstName+ lastName.charAt(2) + rand.nextInt());

        System.out.println();
        System.out.println("your user name is : " + firstName+ lastName.substring(0,3) + rand.nextInt());

       // System.out.println();
       // System.out.println("your user name is : " + firstName.toLowerCase()+ lastName.toLowerCase().charAt(2) + rand_int1);

        //your user name is : abinetn49
    }
}
