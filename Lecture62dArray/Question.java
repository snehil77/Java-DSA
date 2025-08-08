package Lecture62dArray;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and cols:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        // declare array
        int arr [][]=new int [rows][cols];

        // input elements;
        System.out.println("Enter elements:");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        // Show elements:

        System.out.println("Entered numbers are:");

         for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.err.println();
        }
        // search for x:
        System.out.println("Enter number which you want to search:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==x)
                {
                    System.out.println("Found at:(" +i+ "," +j+ ")");
                }
                
            }
        } 
        
    }
    
}
