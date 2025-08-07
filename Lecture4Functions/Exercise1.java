package Lecture4Functions;
import java.util.*;
public class Exercise1 {
    public static void main(String []args)
    {
    //  **** q1-> Enter 3 numbers from the user & make a function to print their average
     Scanner sc=new Scanner(System.in);
    //  System.out.println("Enter number 1");
    //  int a=sc.nextInt();
    //  System.out.println("Enter number 2");
    //  int b=sc.nextInt();
    //  System.out.println("Enter number 3");
    //  int c=sc.nextInt();

    //  average(a, b, c);



    // ***q2-> write a function to print the sum of all odd numbers from 1 to n.

    // System.out.println("Enter any number");
    // int n=sc.nextInt();
    // sum(n);






    }

    // **1 
    // public static void average(int a,int b,int c)
    // {
    //     int avr=(a+b+c)/(3);
    //     System.out.println(avr);
    // }
  


    // **2 
    public static void sum(int n)
    {
       int total=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                 
                 total=total+i;

            }

            else{
                
                System.out.println();
            }

        }

        System.out.println(total);
         

    }

}
