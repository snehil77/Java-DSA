package Lecture3Loops;

public class Patternquestions {

    public static void main(String[] args)
    {
        // **** row 4 pattern
        for(int i=1;i<=4;i++)
        {
            System.out.println("*");
        }
 

// solid rectangle pattern number of rows =4, columns=5
for(int i=1;i<=4;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}

// hollow rectangle pattern number of rows =4, columns=5
for(int i=1;i<=4;i++)
{
    for(int j=1;j<=5;j++)
    {
        if(i==1||i==4||j==1||j==5)
        {
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        

    }
    System.out.println();
}
// half pyramid pattern
for(int i=1;i<=4;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
   }
    
}

// to be continued soon