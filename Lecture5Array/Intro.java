package Lecture5Array;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        
        int [] marks=new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        System.out.println(marks[0]);

        // 2nd way to declare an array
        int age[]={40,50,60};

        // access all elements of an array
        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
            System.out.println(age[i]);
        }

    // array by get size from the user 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size=sc.nextInt();
    int rollNumber[]=new int[size];
    System.out.println("Enter elements of array:");

    // for insert elements into array
  
    for(int i=0;i<size;i++)
    {
        rollNumber[i]=sc.nextInt();

    
       
    }

    // for access array elements
      System.out.println("The elements of array you wrote are:");
    System.out.println("The ");
    for(int i=0;i<size;i++)
    {
        System.out.println(rollNumber[i]);
    }


    }
    
}
