import java.util.Scanner;

/**
 *
 * Referenced from I2JP 9ed P86
 */

public class ComputeTax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter 0 for single, 1 for married jointly, \n" +
                " +  2 for married separately, 3 head of the househould, \n");

        int status = input.nextInt();

        System.out.println("Enter the taxable Income");
        double income = input.nextDouble();

        double tax = 0;

        if(status ==0 )
        {
            if(income <= 8350)
            {
                tax = income * 0.10;
            }

            else if (income <= 33950)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            }

            else if (income <= 82250)
            {
                tax = 8400 * 0.10 + (income - 171550) * 0.15;
            }
            else if (income <= 34000)
            {
                tax = 8400 * 0.10 + (income - 372950) * 0.15;
            }
            else

                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (37290 - 171550) * 0.33 +(income - 372950) * 0.35;
        }

        else if(status == 1 ){}
        else if(status == 2 ){}
        else if(status == 3 ){}
        else {
            System.out.println("Error: Invaled status");
            System.exit(0);
        }

        //
        System.out.println("Tax is " + (int)(tax *100)/100.0);

    }
}
