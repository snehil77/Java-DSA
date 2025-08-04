package Lecture4Functions;

public class Factorial {
    public static void main(String[] args) {

        factorial(5);
        
    }

    public static void factorial (int n)
    {
        if(n<0)
        {
            System.out.println("Invalid Number");
            return;
        }
        for(int i=n-1;i>=1;i--)
        {
            n=n*i;

        }

        System.out.println(n);
    }
    
}
