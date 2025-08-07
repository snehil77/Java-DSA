package Lecture4Functions;
import java.util.*;

public class Exer1q5 {
    // q5-> write a function that takes in age as input and returns if that person is eligible for vote or not.A person of age>18 is eligible to vote.
    public static void main (String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age :");
int age=sc.nextInt();
vote(age);

    
}
public static void vote(int age)
{
    if(age>18)
    {
        System.out.println("Eligible for vote:");
    }
    else{
        System.out.println("Not eligible for vote");
    }
    
}
}
