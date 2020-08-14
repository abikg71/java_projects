/*
MyFISCO
@author Abinet Kenore
April 23, 2020
*/
import java.util.*;
public  class MyFISCO
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Test ");
    }
    /*How many credit cards do you have? 0, 1, 2to 4 , 5 or more;
//     1a. How long ago did you get your first credit card?
      less than 6Ms ago, btw 6m 2ys ago, 2to4, 4to5, 5to8, 8to10, 10to15 15to20, morethan20;
    */
    public static void credit_cards_youHave (int firstCCard, int numberOfCCards)
    {
            System.out.println("Enter how many Credit cards do you've?");
            numberOfCCards = kb.nextInt();
            System.out.println("How long ago did you get your first credit card?");
            firstCCard = kb.nextInt();

    }
    /*
    2a. How long ago did you get your first loan? (i.e., auto loan, mortgage, student loan, etc.)
     0 , 6Ms ago, btw 6m 2ys ago, 2to4, 4to5, 5to8, 8to10, 10to15 15to20, morethan20;
    **/
    public static  void your_first_loan (int firstLoan)
    {
            System.out.println("How long ago did you get your first loan?\n" +
                    " (i.e., auto loan, mortgage, student loan, etc.)?");
            firstLoan = kb.nextInt();

    }
//3. How many loans or credit cards have you applied for in the last year? 0, 1, 2, 3to5, 6ormore;
    public static void how_many_loansOrCCards_applied()
    {

    }

    public static void have_you_opened_new_loanOrCcard()
    {

    }
/*

4. How recently have you opened a new loan or credit card?;
<3m, btween 3 to6m ago, morethan 6months ago;
        5. How many of your loans and/or credit cards currently have a balance?;
0 to 4, 5 to 6, 7 to 8 , 9 or more;

6. Besides any mortgage loans, what are your total balances on all other loans and credit cards combined?;
Only mortgage loans,  < 500, 500 to999, 1000 to 4999, 5000 to 9999, 10,000 to 19,999, 20,000+;

7. When did you last miss a loan or credit card payment?
never missed a payement, in the past 3 months , 3to6m ago, 6to1y, 1to2y, 2to3, 3to4,morethan 4 years ago;
        7a. What is the most delinquent you have ever been on a loan or credit card payment?;
        30 days delinquent, 60, 90, morethan 90;

        8. How many of your loans and/or credit cards are currently past due? 0, 1, 2 or more;

        9. What percent of your total credit card limits do your credit card balances represent?;
        never had a credit card, 0 to9%, 10to19%,20to29%,30to39%, 40to49%,50to69%,70to89%,90to99%
100% or higher;
        10. In the last 10 years, have you ever experienced bankruptcy, repossession or an account in collections? Y/N;

*/


}