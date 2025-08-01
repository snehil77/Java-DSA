// print the greeting message based on the number pressed by the user 1-> hello,2-> namaste, 3-> bonjour
import java.util.*;
class Switch{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Hello, 2 for Namaste, 3 for Bonjour:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Hello!");
            break;
            case 2:
            System.out.println("Namaste!");
            break;
            case 3: 
            System.out.println("Bonjour!");
            break;
            default:

            System.out.println("Invalid choice! Please press 1, 2, or 3.");
        }
    }
}