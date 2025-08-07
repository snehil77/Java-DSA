package Lecture5Array;
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        // take an array as input from the user.search for a given number x and print the index at which it occurs.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        // Input array elements from the user
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++)
        {
              arr[i]=sc.nextInt();
        }

        // travesing array elements
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        // Search for a number
        System.out.println("Enter the number which you want to search:");
        int sear=sc.nextInt();

        for(int i=0;i<size;i++)
        {
            if(arr[i]==sear)
            {
                System.out.println(sear+"is found at:"+i+"index");
            

            }
            // else
            // {
            //     System.out.println("This number is not present in array:");
                
            // }
        }

    }
    
}
