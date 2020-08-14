package Abinet;
/*
@abinet Kenore
May 24 2020
*/

import java.io.File;
//import java.io.FileWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class FileIOPayroll
{
    public static int hr;
    public static int payRate;
    public static double net_pay;
    public static double gross;
    public static double federalTax;
    public static double stateTax;
    public static double other_fees;
    public static double totalFees;
    public static String firstName;
    public static String lastName;
    public static String user_name;

    public static void main(String[] args) throws Exception
    {
        Date date = new Date();

        File inFile = new File("data.txt");
        Scanner input = new Scanner(inFile);

        System.out.println("\n\t\t\t\t\t\t\t\t\t=============== SUMMARY ===============");
        System.out.println("\t\t\t\t\t\t\t\t\t===== " + date + " ====");

        System.out.printf("\n%8s%10s%10s%10s%8s%10s%13S%13s%10s%12s%15s", "FirstName", "LastName", "UserName"," Hours",
                "\t PayRate","GrossPay", "TakeHome","FederalTax","StateTax", "OtherFees", "  TotalFees\n ");

        // FileWriter fwrite =new FileWriter("output.txt");

        while (input.hasNext())
        {
            firstName= input.next();
            lastName = input.next();
            hr = input.nextInt();
            payRate = input.nextInt();

            calulateGrossPay();
            calculateNetPay();
            generateUserName();
            calulateFederalTax();
            calulateStateTax();
            calculateOtherFees();
            calculateTotalFees();

            System.out.printf("\n%-12s%-12s%-11s%-7d%-10d%-12.2f%-12.2f%-12.2f%-12.2f%-10.2f%-12.2f",firstName,lastName,
                    user_name,hr,payRate,gross,net_pay,federalTax,stateTax,other_fees, totalFees);
/*
            fwrite.write("\n"); write it to the output.txt
            fwrite.write(firstName + "\t"  + lastName + "\t" + user_name + "\t" + hr + "\t" + payRate + "\t" + gross
                    + "\t" + net_pay+ "\t" + federalTax + "\t"+ stateTax + "\t"+ other_fees+ "\t" +  totalFees + "\t");
*/
        }

        input.close();
        System.out.println("\n");
        // fwrite.close();
    }

    public static void generateUserName() {
        Random random = new Random();
        user_name = (firstName.substring(0, 3) + lastName.substring(0, 3)).toLowerCase() + random.nextInt(100);
    }
    public static void calulateGrossPay()
    {
        if(hr <= 40)
        {
            gross = hr * payRate;
        }
        else if(hr < 60)
        {
            gross = (hr - 40) * (1.5 * payRate) + (40 * payRate);
        }
        else if(hr > 60)
        {
            gross = hr * 2 * payRate;
        }

    }
    public static void calculateNetPay()
    {
        net_pay = gross - (federalTax + stateTax + other_fees);
    }
    public static void calulateFederalTax()
    {
        federalTax = gross * 0.1; //10%
    }
    public static void calulateStateTax()
    {
        stateTax = gross * 0.0463; //4.63%
    }
    public static void calculateOtherFees()
    {
        other_fees = gross * 0.08; //8%
    }
    public static void calculateTotalFees()
    {
        totalFees = federalTax + stateTax + other_fees;
        //otherway = gross - net_pay;||otherway = gross * .2263;
    }
}
