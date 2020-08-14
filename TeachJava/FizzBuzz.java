
public class  FizzBuzz
{
    public static void main(String[] args)
    {
        // Multiple of the # Fizz
        // Multiple of the 5  Buzz
        // Multiple of the 3 * 5 FizzBuzz

        System.out.println("This an Interview Q");
       // int num;
        for (int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println(i + "Fizz");
            }

            else if (i % 5 == 0)
            {
                System.out.println(i + " ,Buzz");
            }
//            else if(i % 3 == 0  || i % 5 == 0)
              if(i % 15 == 0)
            {
                System.out.println(i + " ,FizzBuzz");
            }
            else
                {
                    System.out.println(i);
               }
        }

    }

}