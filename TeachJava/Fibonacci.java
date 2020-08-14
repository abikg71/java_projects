import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        /*int intialnum = 0;
        int nextnum = 1;
        for (int i = 0; i <= 100 ; i++)
        {
            System.out.print(intialnum +", ");
            int sum = intialnum + nextnum;
            intialnum = nextnum;
            nextnum = sum;
        }*/
        for(int i = 10; i >= 0; i--){
           // System.out.println(i);
            System.out.println(i-10);
        }
    }

//    public static int fib(int n)
//    {
//    int a = 0, b = 1, c;
//    if (n == 0)
//        return a;
//    for (int i = 2; i <= n; i++)
//    {
//        c = a + b;
//        a = b;
//        b = c;
//    }
//    return b;
//}
    
    

}
