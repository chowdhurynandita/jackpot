// Program merges two integers.
import java.util.*;
public class MergeNum
{
    public static void main(String args[])
    {
        int num1 = 0, num2 = 0;
        try (Scanner sc = new Scanner(System.in))
        {
            // Input 2 integers
            System.out.println("\nEnter two numbers to merge");
            // Prompt user to enter first integer
            System.out.print("\nNumber 1: ");
            // Input first integer
            num1 = sc.nextInt();
            // Prompt user to enter second integer
            System.out.print("\nNumber 2: ");
            // Input second integer
            num2 = sc.nextInt();
        }
        int temp = num2, count = 0, merge = num1;
        
        // Count the the number of digits in num2
        while (temp > 0)
        {
            temp /= 10;
            count ++;           
        }
        // Expand merge to accomodate num2
        merge *= Math.pow(10, count);
        // Merge two numbers
        merge += num2;
        // Display merged number
        System.out.println ("\nMerged number : " + merge);
    }
}