import java.util.Scanner;
// package array;

public class rollno {
    public static void main(String[] args) {
        System.out.println("helloo student ");
        Scanner sc=new Scanner(System.in);
        // System.out.println();
        //  int mark;
        System.out.println("enter the number of student:");
        int size=sc.nextInt();
        int[] mark= new int[size];  // intialization of array new int [size] 
        // int n = mark.length;
        for( int i=0;i<=size-1;i++)
        {
            System.out.println("enter the mark of roll no." +(i+1));
           mark[i] =sc.nextInt(); 
        }
        System.out.println("enter the rollno. to see their mark:");
        int n=sc.nextInt();
        // System.out.println("the mark of the rollno." +n+  "is: " +mark[n-1]);
        if(n<=size)
        {
            System.out.println("the mark of the rollno." +n+  "is: " +mark[n-1]);
        }
        else 
        System.out.println("you enter wrong roll no.");
    }
    
}
