/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akenorehw5;

/**
 *
 * @author Abinet
 */
public class InFixToPostFix
{
    private final  Stack<Character> stack;;
    private final String inpuntExpression;
    private String outPut = "";
    
    public InFixToPostFix(String in)
    {
        inpuntExpression = in;
        int stackSize = inpuntExpression.length();
        stack = new Stack(stackSize);
    } 
    
   public String convertInFixToPost()
   {
       for (int j = 0; j < inpuntExpression.length(); j++)
       {
           char nextcharcter = inpuntExpression.charAt(j);
           switch (nextcharcter)
           {
               case '+': 
               case '-':
                   gotOper(nextcharcter, 1); 
               break;
               case '*': 
               case '/':
                   gotOper(nextcharcter, 2); 
               break; 
               case '(':
                   stack.push(nextcharcter);//push("("); look here
               break;
               case ')':
                   gotParen(nextcharcter); 
               break;
               default:
                   outPut = outPut + nextcharcter; 
               break;
           } 
       }
       while (!stack.isEmpty())
       {
           outPut = outPut + stack.pop();
       }
       System.out.println(outPut);
       return outPut; 
    }
   public void gotOper(char opThis, int preccedence1)
   {
      while (!stack.isEmpty())
      {
          char opTop = ((String) (stack.pop() + " ")).charAt(0);
         if (opTop == '(')
         {
             stack.push(opTop);
            break;
         }
         else 
         {
             int preccedence2;
             if (opTop == '+' || opTop == '-')
             {
                 preccedence2 = 1;
             }
             else
             {
                 preccedence2 = 2;
             }
             if (preccedence2 < preccedence1)
             { 
               stack.push(opTop);
               break;
             } 
             else
             {
                 outPut = outPut + opTop;
             }
         }
      }
      stack.push(opThis);
   }
   public void gotParen(char ch)
   {
       while (!stack.isEmpty())
       {
           char temp =((String)(stack.pop() + " ")).charAt(0);
           if (temp == '(')
         {
             
            break;
         }
           else
           {
               outPut = outPut + temp;
           } 
      }
   }
    
} // End of class
