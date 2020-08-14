package Abinet;
/*Ref:Uniprogrammer I I TwitchTV Temp Bit |Youtube
May 16, 20

*/
import java.util.Random;

public class Randomgenerator
{
    public static void main(String[] args)
    {

        //System.out.println(Math.PI);//3.141
       // System.out.printf("PI %1.2f",Math.PI);
        //Random random = new Random();
        // num1, num2
        // sum = num1 + num2
        //print
        //??
       // int kut1, kut2,dimer;

       /* kut1 = random.nextInt(100); //0 to
        kut2 = random.nextInt(100);
        dimer = kut1 + kut2;
        System.out.println("Kut1 is:" + kut1);
        System.out.println("Kut2 is:" + kut2);
        System.out.println("The sum of the two randomly generated numbers is: " + dimer);
*/
       //double num1, num2, sum;
       //num1 = random.nextDouble();// 0 and 1 10
       //num2= random.nextDouble() ;//0.8607330855575539
       //sum = num1 + num2;
       //double x = 1.5761311898411376;
        //System.out.printf("X is  %4.2f",x );
        //System.out.printf("\nX is  %4.3f",x); //1.578 1.58

        //System.out.println("Num1 is :" + num1);
        //System.out.println("Num2 is :" + num2);
        //System.out.printf("X is %4.2f",sum);
        //System.out.println("The sum of the two randomly generated numbers is: " + sum);
        //System.out.printf("X is %4.2f",sum);
       // 0.8607330855575539  0.860 // two or three decimap

        String characters = "-_ABCDEFGHIJKLMNOPQRSTUV WZYZabcdefghijklmnopqrstuvwxyz0123456789";

        String randString1 = "";

        Random random = new Random(); //create

        int length = 15; // 15 times
        // if you use method the bound is characters lenth
       // int length = random.nextInt(characters.length());

        char[] text = new char[length]; //arrays

        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(random.nextInt(characters.length()));//index
        }

        for (int i = 0; i < text.length ; i++)
        {
            randString1+= text[i];
        }
        System.out.println("Your something is:" + randString1);

    }
}
