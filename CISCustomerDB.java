package ciscustomerdb;
/**
 *The application prompts the user to enter a customer number. 
 * If a customer with that number exists, the application displays the -
 * customer’s name and address.
 * If not, the application displays an appropriate message that includes -
 * the customer number.
 * 
 * @author 
 */

import java.util.Scanner;

public class CISCustomerDB
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Customer customer = new Customer();
        int customerNumber = 0;
        System.out.println("welcome to Cosumer Viewer");
        System.out.println();

        boolean done = false;
        while (!done)
        {
             //Prompt the user to Enter customer Number
            System.out.println("Enter a customer Number: ");
            customerNumber = console.nextInt();
            customer.customerInformtion();
            System.out.println();
             // Asks the to user to Enter another Customer Information    
            System.out.print("Display another customer?  y/n : ");
            System.out.println();
            String conti;
            console.nextLine();
            conti = console.nextLine();
            if (conti.equalsIgnoreCase("y"))
            {
                done = false;
            }
            else
            {
                done = true;
            }
        }   // End of while loop
    } // End of the main
    
} // Endof the class 
