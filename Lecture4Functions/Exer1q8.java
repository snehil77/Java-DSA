package Lecture4Functions;
import java.util.Scanner;

public class Exer1q8 {
    public static void main(String[] args) {
        // two nummbers are entered by the user,x and n,write a function to find the value of one number raised to the power of another.
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of x & n:");
int x=sc.nextInt();
int n=sc.nextInt();
power(x,n);


    }

    public static void power(int x,int n)
    {
        int result=1;
            for(int i=1;i<=n;i++)
            {
                result=result*x;
            }
            System.err.println(result);
    }
    
}
