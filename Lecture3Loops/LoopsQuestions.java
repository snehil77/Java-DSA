package Lecture3Loops;
import java.util.*;
// print the sum of n natural numbers
public class LoopsQuestions {
    public static void main(String[]args)
    {
        int sum=0;
        for(int i=1;i<=4;i++)
        {
            sum=sum+i;
            
        }
        System.out.print(sum);
  

// print the table of a number input by the user 

System.out.println("Enter a number to print its table:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
   System.out.println(n*i);
}
  }
    
}
