package Abinet;
import java.math.*;
public class FormattingConsoleOutput
{
    public static void main(String[] args)
    {
       /* double x = 1.0/3.0;
        System.out.println(x);
        System.out.printf("X is %4.2f",x);
        System.out.println("Math Pi is " + Math.PI);
        System.out.printf("Math Pi is %4.3f ", Math.PI);
        System.out.println(Math.hypot(4, 5));
*/
        System.out.printf("%8d%8s%8.4f\n", 1234, "Java ", 5.611111322);
        System.out.printf("%-8d%-8s%-8.4f\n", 1234, "Java ", 5.6111123322);

    }
}
