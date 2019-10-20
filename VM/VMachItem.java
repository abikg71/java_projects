//package vendingmachine
/**
 *
 * @author Abinet
 */
// Written by Abinet Kenore, CS 1050, Spring 2016, MSU DENVER, CO.
// Final Project of the class about Vending machine
// Mac IOS 10.10.05, 2012
// The proggram is written on JGRASP 1.8
// I 2 JAVA Programming

import java.util.*;

public class VMachItem
{
    static Scanner console = new Scanner(System.in);

    // This are the Item list in the Vending Machine and with a number choice.

    static String[] ITEMONVM = new String[]{ "Botteled Water", "Ocean Spray",
         "MinuteMaild","V8Fuision", "CokeZero", "SpriteZero","Diet7Up",
         "PepsiMax","Chips","Gums", "Snacks", "Mangojiuce","Drpepper","Candy",
         "Milk","Wine"};

    static String [] priceArr = new String[]{ "2.59", "3.06", "1.97", "0.67",
        "0.99","1.00", "0.23", "2.20", "1.02","0.88", "1.47", "1.99", "1.37" ,""
            + "0.87", "2.51", "3.01", "0.20"};

    static double Date, Isold, total,Change, TotTax = 0.0;
    int Ctr = 1;
    static double sprice;
    static String aItem;
    String userN; // Username of person
    int passW; // Password of person
       //test
    public void arrange(int num)
    {
        //sprice = priceArr[num-1]; //do sthg
        total += sprice;
        aItem = ITEMONVM[num-1];
        System.out.println("You choosen Item is " + aItem + " & your price "
                + "is: "  + sprice);

     }
     public static double totalF()
     {
         return total;

     }
     public static double Isold(int i)
     {
         return total;

     }
     public void Summary(int ctr)
     {
         System.out.println("Item sold is " + Ctr);
         System.out.println("The total transcction made is " + total);
     }
}//end Isold
