/*
@ Abinet Kenore
prompt the use to Enter n number in row and calculate
  mean and standard deviation
  Objective foor loop and advanced math fromulas.

*/
import java.util.Scanner;
public class HelpMean_sdeviation
{
  public static void main(String[] args)
  {
    /* some of this code is copied from online
    Java Program to Add n Numbers - Codescracker
    */
    int i, n, sum=0, num;
    double mean = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Number You want to Enter to Add them ? ");
        n = scan.nextInt();
        System.out.print("Enter " +n+ " numbers : ");
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            sum = sum + num;
            mean = sum/n;
                //https://en.wikipedia.org/wiki/Standard_deviation
            //2,\ 4,\ 4,\ 4,\ 5,\ 5,\ 7,\ 9.
            // 5
            // First, calculate the deviations of each data point from the mean, and square the result of each:
            //(2- 5)square
            // v = sqr(d/n)
        }

        System.out.print("Sum of all " +n+ " numbers is " +sum);
        System.out.print("mean of all  numbers is " + mean);
  }
}
