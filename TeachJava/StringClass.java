/*
Strings And Test I/O
Approach
Write a program which asks a user to enter his/her first and last name separately
Manuplate:  equals,  concat,  toLowerCase, charAt,  length,  firstIndexof,  replace, replaceAll,  comareTo, ...
@Abinet Kenore
May 13, 20
Note: Bring the TestScore class to show we are going to build up on the top of..
*/
import java.util.*;
public class StringClass
{
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    Random rand = new Random(); //
    // Generate random integers in range 0 to 99 71,77
    int rand_int1 = rand.nextInt(100);
    int rand_int2 = rand.nextInt(1000000); //0 99999

    //int sum = rand_int1 + rand_int2
    // Abinet kenore score 89 Grade B
    
    String firstName;
    String middleName;
    String lastName;

    // Prompt the user
    System.out.println("Enter First Name");
    firstName = console.nextLine();
    System.out.println("Enter Middle Name");
    middleName = console.nextLine();
    System.out.println("Enter last Name");
    lastName = console.nextLine();
 //   int num;
  // System.out.println("Enter num");
   //num = console.nextInt();

    /*
    System.out.println(firstName + lastName);
    System.out.println(firstName == lastName);// boolean
    System.out.println(firstName == firstName);
    System.out.println(firstName.equals(lastName));
    System.out.println(firstName.compareTo(lastName));
    System.out.println(firstName.compareTo(firstName));
    System.out.println(firstName.length());
    System.out.println(firstName.concat(lastName));
    System.out.println(lastName.concat(firstName));
    System.out.println(firstName.charAt(0));
    System.out.println(firstName.toUpperCase());
    System.out.println(firstName.toUpperCase().charAt(0));
    System.out.println(firstName + lastName.substring(0,3));
    System.out.println((firstName + lastName.substring(0,3)).toUpperCase());
    System.out.println((firstName + lastName.substring(0,3)).toLowerCase());
    System.out.println((firstName + lastName).toLowerCase());
    System.out.println(firstName.toLowerCase() + lastName.toLowerCase());
    System.out.println(firstName.toLowerCase() + lastName.toLowerCase().charAt(2));
    System.out.println(firstName.toLowerCase() + lastName.toLowerCase().charAt(2))*/
   // System.out.println(firstName.toLowerCase() + lastName.toLowerCase().charAt(0) + rand_int1);
   // System.out.println(rand_int2);
  }

}


/**

 3f2l3n
 **/