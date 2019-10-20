// Writen by Abinet Kenore, CS 1050, Spring 2016, MSU DENVER,CO.
// Final Project of the class about Vending machine
// Mac IOS 10.10.05, 2012
// The proggram is written on JGRASP 1.8
// I 2 JAVA Programming
//Revisted on 04/30/19

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.lang.String;
public class VMachine {

public static final double Tot_Tax = 0.20;
   static int totalItem = 20;
   static String [] iSold= new String[totalItem];

public static void Mangt() {
    int passW=0;
    Scanner console = new Scanner(System.in);
    System.out.println (" Please enter a username");
    String userN = console.nextLine();
    System.out.println (" Please enter a Password");
    passW = console.nextInt();

  if (passW !=12345 || userN !="Abinet")// Checks both user name & password matches
    System.out.println("Incorrect useranem or Password");
  else
    System.out.println ("What you WANNA DO");
    }

public static void main (String[] args) throws IOException {

  FileWriter outputDataFile = new FileWriter ("VMS_out.txt");
  PrintWriter outputFile = new PrintWriter(outputDataFile);
// Creating objects
   Scanner console = new Scanner(System.in);
  VMachItem im = new VMachItem();
   Date date = new Date();

 // Declaring the price for each Item on the Array list.
   double [] price = new double[]{ 2.59, 3.06, 1.97, 0.67, 0.99, 1.00,
     0.23, 2.20, 1.02,0.88, 1.47, 1.99, 1.37 ,0.87, 2.51, 3.01, 0.20};

    String space = "-----------------------------------------------------\n";
   double total = 0.0;

 // Iniallzing the constructors
  double Date, amt, Change, TotTax = 0.0;
  int Ctr, Isold = 0;
 // Asks whether the you are a Manger or the costumer
    System.out.println("Are you a manager?\n Answer yes or No");
    String choice = console.nextLine();
  if (choice.equalsIgnoreCase("y")){
    Mangt();
    System.out.println("");
    System.out.println ("What you WANNA DO");}
  else{
    System.out.println("WELCOME TO OUR STORE!");

 // Prompt the user to to select the item from the menu
  boolean done = false;
  while (!done)
  {
 // Lets the user/customer what Items are on the machine
    String ITEM = "1-BotteledWater, 2-OceanSpray,3-MinuteMaild\n"
     + "4-V8Fuision,5-CokeZero,6-SpriteZero,7-Diet7Up,8-PepsiMax,9-Chips,\n"
     + "10-Gums,11-Snacks,12-Mangojiuce,13-Drpepper,14-Candy,15-Milk,and 16-Wine";
 // Asks what the customer would like to buy from the given list
    System.out.println("What would you like to Buy\n"
      + "Selct the Item from the menu " + ITEM);
  int Item = console.nextInt(); // Prompts the user to select the Item

  if (Item > 0 && Item <= 16)
  {  // Checks the item is on the list
        im.arrange(Item);

     // Asks the user to make a payemant for the Item
        System.out.println("Please Make the Payement of $" +  price[Item-1]);
        amt = console.nextDouble();
      while (amt < (price[Item-1]))
      {  // Asks the user to add more money
           System.out.printf("The amount is insafficent for the payement, and $%.2f \n " ,
           (Math.abs(amt - (price[Item-1]))));
           System.out.print("is needed, please add more money for the Item. \n");
           amt +=console.nextDouble();
        } // End of while loop

        Change = (amt -  (price[Item-1]));
     // Prints out the Day of the week, Month, date,time zone,and year.
        System.out.printf("THANK YOU for Purchase" +", your change is: $%.2f \n",Change);
        Ctr ++;
        iSold[Ctr]=im.ITEMONVM[Item-1];
    }

 // Tell that the Item is not on the store and gives him a list of the Item
  else {
     System.out.println("We Don't have a Item, SORRY!");
    }

 // Asks the to buy something else the machine has.
    System.out.print("Would you like to buy an other Item? Please choose \n"
     + "something else? \nPress y to continue or any other key to exit: ");
    String Conti;
    console.nextLine();
    Conti = console.nextLine();
  if (Conti.equalsIgnoreCase("y")){
    done = false;
    System.out.print(space);
    }
  else {
        done = true;
        VMachItem.Isold(Isold,Ctr, outputFile);
        System.out.println("THANK YOU. Come Again.");
        System.out.println(date);
        System.out.print(space); // cuts the paper.
        System.exit(0);
        System.out.println(date);
        //Prints out the time even a customer wont buy anything

    }
   } // End of while (!done)
 }
     outputFile.println("what are you doing");
     outputFile.close();
     System.exit(0);
}

}//end main*/
