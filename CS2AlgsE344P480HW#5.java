//HOME WORK PROBLEMS FROM TEXTBOOK
// The following code is writteN to check the given instruction on the Algs4ed
//Chapter 1, Ex 3.4., Pro#4
// Abinet Kenore, MW 06:00 T0 07:50 CS 2050 Fall 2016,
//
import java.util.*;

public class CS2AlgsE344P480 {

   char copy[], chr1;
   int temp, val,array[];
   
public CS2AlgsE344P480(char[] arr) {

    this.copy = new char[arr.length];
    this.array= new int[arr.length];
    for(int i = 0; i < arr.length; i++)
    copy[i] = arr[i];
    
  temp = arr.length;
}
public void convert(){
      for(int i = 0; i < temp; i++) {
         chr1 = copy[i];
         val = ((int)chr1) - 15;
         val= (3*val)%25; // M = 25 and a 3. 
         // For different values of M & a, You will get d/t Output. 
         array[i] = val;
         System.out.println(val);
        }
   }

public static void main (String[] args){

      char Orginal[] = new char[]{'E','A','R','C','H','X','M','P','L'};
      System.out.println(Orginal);
      CS2AlgsE344P480 rt= new CS2AlgsE344P480(Orginal);
      rt.convert();
      }
}