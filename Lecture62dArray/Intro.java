package Lecture62dArray;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        // create 2d array take number of rows and column and array elements from the user and print it

        // input number of rows and columns from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of cols:");
        int cols=sc.nextInt();

        int arr [][]=new int [rows][cols];

        // enter values of elements;
        System.out.println("Enter values of elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }

        // print array elements:
          for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+ " ");

            }
        }
    }
    
}
