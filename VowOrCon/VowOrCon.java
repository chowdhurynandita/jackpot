// Determines whether an alphabet is a vowel or a consonant
import java.util.*;
public class VowOrCon
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            // Prompt user to enter character
            System.out.print("\nAlphabet: ");
            // Input character
            char ch = sc.nextLine().charAt(0);
            // Check if character is an alphabet
            if (Character.isLetter(ch))
            {
                if (
                    ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E'||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U'
                )
                    System.out.println("It is a Vowel");
                else 
                    System.out.println("It is a consonant");
            }
            // If character is not an alphabet
            else
            System.out.println("WRONG INPUT!");
        }
    }
}