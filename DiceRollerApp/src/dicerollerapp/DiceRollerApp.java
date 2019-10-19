package dicerollerapp;

/**
 *This class should display special messages for craps (sum of both dice is 7),
 * snake eyes (double 1’s), and box cars (double 6’s). For this application,
 * assume that two six-sided dice are used.
 * Operation: if the user chooses to roll the dice, the application rolls two 
 * six-sided dice, displays the results of each, and asks if the user wants to 
 * roll again.
 * @author Abiyu Aserese
 * @version 03192017
 */

import java.util.Scanner;
public class DiceRollerApp
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);  
        PairOfDice dice;   // A variable that will refer to the dice.
        dice = new PairOfDice();  // Create the PairOfDice object.

        System.out.println("Welcome to the Paradise Roller ");
        System.out.println();
        
         boolean choice = false;
         while(!choice)
        {
            System.out.println("Roll : ");
            System.out.println("The Roll: " + dice.getValue1() + 
                    " and " + dice.getValue2());
            
            if(dice.getSum()!= 0)
                if(dice.getSum() == 7)
                {
                    System.out.println("Craps!");
                }
                else if(dice.getSum() == 6)
                {
                    System.out.println("Box cars");
                }
                else if (dice.getSum() == 1)
                {
                    System.out.println("Snake eyes");
                }
            
          /* Report the number of rolls. */
          //System.out.println("\nIt took " + rollCount + " rolls to get a 7.");
           System.out.println("Roll again?\n  y / n, press y to continue or any "
                   + "other key to exit ");
           String YN; // prompts the user to say yes/no 
            console.nextLine(); 
            YN = console.nextLine();
            if(YN.equalsIgnoreCase("y"))
            {
                choice = false;
                dice.roll(); // calls to regenerate the sides of dice
            }  // Something has to be done here in order to keep looping
            else
            {
                choice = true;
            } 
           
        }
    }
}
