package Lecture5Array;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        // 1->take an array of names as input from the user and print them on the screen.
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        sc.nextLine();
        String names[]=new String[size];

        // input elements from user:
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++)
        {
            names[i]=sc.nextLine();

        }

        // print elements of array on the screen:
        for(int i=0;i<size;i++)
        {
            System.out.println(names[i]);
        }



    }
}
