package akenorehw5;

/**
 * This program converts the given infix expression to postfix using the method 
 * from the PostFix class related to the stack class.
 * @author Abinet Kenore
 * @version 04082017
 * 
 */
import java.util.Scanner;

public class AKenoreHW5
{
    public static void main(String[] args)
    {

        Scanner console = new Scanner(System.in);
        String inpuntExpression = "";
        /*        PostFix convert = new PostFix();*/
        String outPut;
        // prompt the user to enter the String
        boolean choice = false;
        while(!choice)
        {
            System.out.println("Please enter the Input Expression");
            inpuntExpression = console.nextLine();
            /*            outPut = convert.convertToPostfix(inpuntExpression);*/
            
            // display the output(postfix expression)
            System.out.println("Out Put Exrpession is " + InFixToPostFix.class);
                // prompt the user wants to compute again
            System.out.println(" " + " \n y/n, press y to continue"
                    + " or any other key to exit ");
            String YN; // prompts the user to say yes/no 
            console.nextLine(); 
            YN = console.nextLine();
            if(YN.equalsIgnoreCase("y"))
            {
                choice = false;    
            }
             else
             {
                choice = true;
             }   
        } // End of while   
    }  
}
