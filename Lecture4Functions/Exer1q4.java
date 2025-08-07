package Lecture4Functions;
import java.util.*;

public class Exer1q4 {
    public static void main(String[] args) {
        // function which takes in the radius as input and returns the circumfrance of a circle

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        int rad=sc.nextInt();
        double cir=circumfrance(rad);
        System.out.println(cir);
        sc.close();




    }

    public static double circumfrance(int rad)
    {
        // circumfrance of a circle =2pir

        double y=(2)*(3.1416)*(rad);
        return y;

    }
    
}
