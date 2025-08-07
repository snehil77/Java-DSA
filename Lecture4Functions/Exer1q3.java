package Lecture4Functions;
// q3-> write a function which takes in 2 numbers and returns the greater of those two

import java.util.*;
public class Exer1q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
         System.out.println("Enter 2nd number");
         int b=sc.nextInt();

         int large=greater(a,b);
         System.out.println("The greatest number is"+large);

    }

    public static int greater(int a,int b)
    {
        int gre=0;
        if(a>b)
        {
            gre=a;
            
        }
        else if(b>a)
        {
            gre=b;
        }
         
        return gre;
           
    }

}