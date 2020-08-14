/* String Formattinge explained.
Abinet Kenore
May 23, 2020
Math library
Random library
*/
import java.util.*;
import java. lang. Math;
public class StringFormatting
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    //3 & 4
    double circle,area, width, length;
    System.out.println("Enter length and width one after the other");
    length = kb.nextDouble();
    width= kb.nextDouble();
    area = length * width;
    System.out.println(area);
    circle = length *length * Math.PI;
    System.out.println(circle);
    System.out.printf("x is %4.3f", circle );
    System.out.println("\nPI is " + Math.PI);
    System.out.printf("PI is %3.3f ",Math.PI);

    //Methods

  }

}
