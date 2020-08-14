package Abinet;
import java.util.Scanner;
import java.io.File;
public class Payroll
{
    public static String firstName;
    public static String lastName;
    public static int hr;
    public static int payRate;
    public static double gross;
    public static double netPay;
    public static double federalTax; //10%
    public static double stateTax; //4.63%
    public static double otherFees; //8%
    public static double totalFees;

    public static void main(String[] args) throws Exception
    {
        File inFile = new File("data.txt");
        Scanner input = new Scanner(inFile);
        if(inFile.exists())
        {
            System.out.println("File Exists");
        }

        while (input.hasNext())
        {
            firstName = input.next();
            lastName = input.next();
            hr = input.nextInt();
            payRate = input.nextInt();
            federalTax = 0.1 * gross;
            stateTax = 0.0463 * gross;
            otherFees = 0.08 * gross;

            netPay = gross - (gross * 0.2263);

            if(hr <= 40)
            {
                gross = hr * payRate;
            }
            else if(hr <= 60)

            {
                gross = (hr - 40) * (1.5 * payRate) + (40 * payRate);
            }
            else if (hr > 60 )
            {
                gross = 2 * hr * payRate;
            }
            else {
                System.out.println("Something Wrong");
            }
//            System.out.println(firstName +  lastName + hr + payRate +gross + netPay + federalTax
//                    + stateTax + otherFees + totalFees);

            System.out.printf("\n%-12s%-12s%-7d%-10d%-12.2f%-12.2f%-12.2f%-12.2f%-10.2f%-12.2f",firstName,lastName
                    ,hr,payRate,gross,netPay,federalTax,stateTax,otherFees, totalFees);

        }
       // System.out.println(gross);
        //input.close(); // close
    }
}
