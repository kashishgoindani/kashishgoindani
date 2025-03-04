
//calculator 
import java.util.Scanner;

public class calculator
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

 System.out.println("Welcome in simple calculator");

while(true)
{ 
   System.out.println("Enter first number");
   double num1 = sc.nextDouble();

   System.out.println("Enter operator ( + ,- , * , / , %): " );
   char operator = sc.next().charAt(0);
   
   System.out.println("Enter second number");
   double num2 = sc.nextDouble();
       
   double result = 0;
   boolean validop = true;    
   
      switch(operator)
	{
	  case '+':
	  {
	    result = num1 + num2;
	    break;
	  }
	  case '-':
	  {
	    result = num1 - num2;
	    break;
	  }
	  case '*':
	  {
	    result = num1 * num2;
	    break;
	  }
	   case '/':
	  {
	    if(num2 !=0)
	    {
	    result = num1 / num2;
	    }
	    else
	    {
	     System.out.println("Error b/c num2 is 0");
		validop = false;
	    }
	 	break;
	  }
	    case '%':
	  {
	    if(num2 !=0)
	    {
	    result = num1 % num2;
	    }
	    else
	    {
	     System.out.println("Error b/c num2 is 0");
		validop = false;
	    }
		break;
	  }
	 default:
	{
	System.out.println("Invalid operator");
	}
}
	
	if(validop)
	{    
	   System.out.println("Result : " + result);
	}       
                
         System.out.println("do you want to continue (yes/no)");
	  String choice = sc.next();
            
	 if(!choice.equalsIgnoreCase("yes"))
	 {
	   System.out.print("Thanku goodbye have a nice day");
	   break;
	 }
    }
  }
}
            
           