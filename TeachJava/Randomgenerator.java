//package Abinet;
/*Ref:Uniprogrammer I I TwitchTV Temp Bit |Youtube
May 16, 20

*/
import java.util.Random;

public class Randomgenerator
{
    public static void main(String[] args)
    {
        // A-Z, a-b, 0-9, symbols
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWZYZabcdefghijklmnopqrstuvwxyz0123456789-_";

        String randomString = "";
        Random random = new Random();
        int length = 12;
        // if you use method the bound is characters lenth
       // int length = random.nextInt(characters.length());

        char[] text = new char[length];

        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(random.nextInt(characters.length()));//index
        }
        for (int i = 0; i < text.length ; i++)
        {
            randomString+= text[i];
        }
        System.out.println("Your something is:" + randomString);
    }
}
