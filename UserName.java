

import java.util.*; 
import java.io.*;

class UserName 
{

  public static String CodelandUsernameValidation(String str) 
  {
    // code goes here  
    char[] a = str.toCharArray();
//	1)
    if (a.length <= 4 || a.length >= 25)  
	{
		System.out.println("Hello");
      return "false";
    }
//	2)
    if (!Character.isLetter(a[0]))
	{
      return "false";
    }
//	3)
    for (int i = 0; i < a.length; i++)
	{
      if (!(Character.isLetter(a[i]) || Character.isDigit(a[i]) || a[i]=='_'))
	  {
          return "false";
      }
    }
//	4)
    if (a[a.length-1]=='_')
	{
      return "false";
    }
    return "true";
  }
  

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}
