package Lecture4Functions;
import java.util.*;

public class Exer1q7 {
    public static void main(String[] args) {
        // wap to enter the numbers till the user wants and at the end it should diplay the count of positive,-ve and 0's entered

     Scanner sc=new Scanner(System.in);
     System.out.println("How many times you want to enter the number:");
     int num=sc.nextInt();
     int poscount=0;
     int negcount=0;
     int zerocount=0;
     
     System.out.println("Enter Numbers ");
     for(int i=1;i<=num;i++)
     {
        int a=sc.nextInt();
        if(a>0)
        {
            poscount++;
        }
        else if(a<0)
        {
                 negcount ++;
        }
        else if(a==0)
        {
            zerocount ++;
        }
     }
         System.out.println("The number of +ve numbers are :"+poscount);
     System.out.println("The number of -ve numbers are :"+negcount);
      System.out.println("The number of zero numbers are :"+zerocount);

    }
   

    
}
