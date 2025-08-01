// check adult or not
// if age is greater than or equal to 18 then adult else minor
import java.util.*;
class Ifelse{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    
    


// check wether a number is even or odd

System.out.println("Enter a number:");
      
    int number=sc.nextInt();
    if(number%2==0){
        System.out.println("The number is even.");
    } else{
        System.out.println("The number is odd.");
    }


    // get two numbers from user a and b check wether the number is greater,equal or less than
    System.out.println("Enter first number:");
    int a=sc.nextInt();
    System.out.println("Enter second number:");
    int b=sc.nextInt();
    if(a==b)
    {
        System.out.println("a==b");
    }
    else if(a>b){
        System.out.println("a>b");

    }
    else{
        System.out.println("a<b");
    }
}
}

