package ciscustomerdb;

/**
 * This is a customer class
 * Which has a information of the customer's and their Billing 
 * address's
 * @author 
 * @version
 */

import java.util.Scanner;

public class Customer
{
   private static String customerInfo; 
   private static int customerNumber;
   static Scanner console = new Scanner(System.in);
   
   public static void customerInformtion()
   {
       customerNumber = 0;
       // This is a given Information to test 
//     System.out.println("This is a Customer Information class");
//     System.out.println("Please Enter Custom Number 1001 for Barbara White\n"
//        + " 3400 Richmond Parkway#3423Bristol\n,CT 06010, 1002 for Karl Vang"
//              + " 327 Franklin StreetEdina,MN 55435,\n1003 for Ronda Chavan"
//              + " 518Commanche Dr.Greensboro, NC 27410");

        customerNumber = console.nextInt();
        if(customerNumber>0)
        
           if(customerNumber == 1001)
            {
               customerInfo = "Barbara White\n3400 Richmond "
                            + "Parkway #3423\n Bristol, CT 06010 ";
                System.out.println(customerInfo);
               
             }
             else if(customerNumber == 1002)
             {
               customerInfo = "Karl Vang\n327 Franklin Street\n"
                            + "Edina, MN 55435";
                System.out.println(customerInfo);
                       
             }
             else if(customerNumber == 1003)
            {
               customerInfo = "Ronda Chavan\n518 Commanche Dr.\n"
                            + "Greensboro, NC 27410 ";
                System.out.println(customerInfo);
               
            }
             else 
                System.out.println ("There is no customer number: "
                            + customerNumber + " in our records ");        
   }
}
