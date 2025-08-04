package Lecture4Functions;
import java.util.*;
public class Functions {
    public static void main(String[]args)
    {
        // print a given name in a function
        System.out.println("Enter Your Name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        
        printName(name);
        
    }

    public static void printName(String name)
        {
           System.out.print(name);
           return;
        }
}

