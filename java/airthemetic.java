
import java.util.Scanner;

public class airthemetic {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("hello"); 
      System.out.println("enter the airthmetic sign");
      String s=sc.nextLine();
      String[] stringArray = {"+", "-", "*" ,"/"};
      System.out.println("enter first digit");
      int a=sc.nextInt();
      System.out.println("enter second digit");
      int b=sc.nextInt();
      if(s.equals("+"))
      {
        System.out.println("the addii is:" +(a+b));
      }
      
      else if(s.equals("-"))

      {
        System.out.println("the subsi is :"+(a-b));
      }
      else if(s.equals("*"))
{
  System.out.println("the multi is :"+(a*b));
}
else if(s.equals("/"))
{
  System.out.println("the divi is :"+(a/b));
}
else 
System.out.println("bhai galat dala he");
    }
}
