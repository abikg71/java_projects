package akenorehw5;

/**
 * This class converts the input Expression to PostFix .
 * @author Abinet Kenore
 */
/*public  class PostFix
{
private  Stack<Character> stack;
public  String convertToPostfix(String inpuntExpression)
{
String outPut = " ";
char temp;

for(int i = 0; i< inpuntExpression.length(); i++)
{
char nextcharacter= inpuntExpression.charAt(0);
switch(nextcharacter)
{
case ('+'):
case ('-'):
while(!stack.isEmpty())
{
temp= stack.pop();
outPut  = outPut + temp;
}

break;
case '*':
while(!stack.isEmpty())
{
temp = stack.peek();
}
break;

case '/':
temp = stack.pop();
outPut = outPut + temp;
//break;
stack.push(nextcharacter);
break;

case '(':
stack.push(nextcharacter); // push("(")

break;
case ')':
temp = stack.pop();
while(temp != '(')
{
temp =   stack.pop();
outPut = outPut + stack.pop();
}
break;

default: break;

}
while(!stack.isEmpty())
{
temp= stack.pop();
if(temp == '(' ){
break;
}
else{outPut = outPut +temp;}

}
}
return outPut;
}

} // end of PostFix*/