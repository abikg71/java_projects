#CISProjCusTrans

package cisprojcustrans;

/** CISProjCusTrans and Audting the balance
 * A computer program is required by the Metro Auraria Student Credit Union-
* to allow a user to input customer data from a keyboard. 
* The input data includes the customer account number, beginning balance,-
* the end of month date and the per transaction penalty amount for overdrafts.
* That input is then followed by each customer transaction record which
* contains the transaction number, type, and amount.
* The conclusion of data will be indicated by the presence of -
* a 0 in the transaction number field.
* The program must output a report to the screen by displaying all the data input.
* When reporting each transaction record the transaction amount needs-
* to be followed by the running balance amount and any applicable overdraft 
* amount.
* After all transactions record have been displayed a report summary is required 
* to display the dollar amounts for the customer's ending balance, total credits
* total debits, average credit amount and the lowest debit amount.
* Additionally the low debit amount needs to be followed by the corresponding 
* transaction number.
*/
//****************************************************************************
/**
 * Abinet Kenore
 * This program has some issuse related to solving some math Operations.
 * If I get the proper orentattion for those bugs I can modiify it.
 * Unless this is what all I knew.
 * I wrote this code is to help on of my freinds in CIS Student
 * Project CIS 2110, Nov 08, 2016
 * Professor Owen Herman
*/
import java.io.*;
import java.util.*;

public class CISProjCusTrans
{   //Declaring and Initializing the variables
    static double totCred = 0;    //
    static double transAmt = 0; // the transaction amount
    static double totDe = 0;      static double totOD = 0;   
    static double odPnlty = 0;    static double evPnlty = 0;  
    static double pnalty = 0;     static double totAmt;    
    static int actNr;    // the customer account number
    static int trnNr;     //the transaction number 
    static int trnType; //the transaction type  
    static double begBal;    // the customer's beginning balance
    static double minDeTranNr;   static double endBal ;     
    static double crCount = 0;   static double minDeAmt = 99999;      
    static double rBal;          static double avgCred,minDeTrarnNr;

public static void main (String[] args) throws IOException
{
    final String FILE_INPUT = "VMS_cis.txt" ;
    final String FILE_OUTPUT = "VMS_cisout.txt" ;
    FileWriter outputDataFile = new FileWriter(FILE_OUTPUT);
    PrintWriter outputFile = new PrintWriter(outputDataFile);
 
    Date date = new Date(); //prints Date of the Trans Process
    Scanner console = new Scanner(System.in);// Creating the SCanner
    String space = "------------------------------------------------\n"; 
   
  // Auditor's Information (It can be a programer name)
    String first, last; // First and last name of the Auditor 
    System.out.print("Enter first and last name separated by a space: ");
    first = console.next();
    last = console.next();
    System.out.println("The Auditor is: " +
    first.charAt(0) + "." + last + "."); // First intital and last name 
    System.out.println(date);
    System.out.println(space); //
      
 // Prompt the Auditor to choose  Trans type 
    boolean trmNr = false;
    while (!trmNr) {
    System.out.println("Please select the Trans Type, which you want\n"
       + "to Apply; 1-to ProcessCR, and 2-to ProcessDR");
    int Char = console.nextInt(); // Accepts letter from the user
    switch (Char)
         {
         case 1:
            System.out.println("You are going to process CR");
            System.out.println("Please enter Act.Number");
            actNr = console.nextInt();
            System.out.println("Please enter total Credit");
            totCred = console.nextDouble();
            System.out.println("Please enter trans Amount");
            transAmt = console.nextDouble();
            ProcessCR(totCred,transAmt,actNr);
            DisplayInfo(endBal,minDeTrarnNr,minDeAmt,//Elements needed
               totOD,totDe,totCred, avgCred); // to process CR
         
         // End of case 1 case
         
         break;
         case 2:
            System.out.println("You are going to process DB");
            System.out.println("Please enter Act.Number");
            actNr = console.nextInt();
            System.out.println("Please enter Beginning Balance");
            begBal = console.nextDouble();
            System.out.println("Please enter total Debit");
            totDe = console.nextDouble();
            System.out.println("Please enter trans Amount");
            transAmt = console.nextDouble();
            System.out.println("Please enter rBal");
            rBal = console.nextDouble();
            ProcessDB(totDe,totAmt,actNr);
            DisplayInfo(endBal,minDeTrarnNr,minDeAmt, //Elements needed
            totOD, totDe,totCred, avgCred);// to process DR
          
         //End of 2 case   
         default:
         System.out.println();
         System.out.println("You Didn't Decided to Process any of \n"
            + " the Trans Program Written AKenore "
               + "<<Project #3 Pseudocode.Java>> of CIS 2110, Fall 2016");
         trmNr = true;
               
         //Asks the  Auditor to something else.
     System.out.println("Would you like to buy an other Item?\n"
         + "Please choose  something else? \nPress y to continue\n"
         + " or any other key to exit: ");
     String Conti; //Declarig string for conitiunition or termination
     console.nextLine(); // of the Trans process
     Conti = console.nextLine();
     if (Conti.equalsIgnoreCase("y"))
     {
         trmNr = false;
         System.out.print(space);
         
      }  
     else
     {
         trmNr = true;
         System.exit(0);
     } //  
   }
  }
      outputFile.close(); // Closing IO loop
}//End of main class 

public static void ProcessCR(double totDe, double totAmt,int actNr)
{
    totCred = totCred + transAmt;
    crCount = crCount + 1;
    rBal = rBal + transAmt;
    pnalty = 0;
    System.out.println("Total Credit is $ " + totCred);
         
} 
         // End of ProcessCR method
public static void ProcessDB(double totDe, double totAmt,int actNr)
{
    totDe = totDe + transAmt;
    rBal = rBal - transAmt;
    System.out.println("Total Debit is $ " + totDe);
    System.out.println("Remaining Balance is $ " + rBal);
   if (rBal<=0)
   {
       pnalty = odPnlty;
       totOD = totOD+pnalty;
           
    }
   else
   {
       pnalty = 0;
       
    }
   rBal = rBal-pnalty;
   if(transAmt<minDeAmt)
   {
       minDeAmt=transAmt;
       minDeTranNr = trnNr;
    } 
                    
}// End of ProcessDB method
         
  //Displays the Processed Detail Information  
public static void DisplayInfo(double totCred,double totDe,double totOD,
        double avgCred, double minDeAmt,double minDeTranNr, double endBal)
{
    avgCred = totCred/crCount;
    endBal = rBal;
    rBal = begBal;
    System.out.println("Average Credit is $ " + avgCred + "\nEnding Balance is "
            + "$ " + endBal+ "\nLowest Debit transaction is $ " + minDeTranNr+ 
            "\n DONE!" + "\n Last modified Tue Nov 8, 11:55 AM,2016 "+ 
            "\n Revisted Mon Mar 20, 9:11 AM, 2017" );
}        
}//End of class 

