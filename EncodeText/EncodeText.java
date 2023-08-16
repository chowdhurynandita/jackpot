// Program encodes texts
import java.util.Scanner;
public class EncodeText
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            // Prompt the user for input
            System.out.print("Text: ");
            // Input text
            String text = sc.nextLine();
            // Find the length of text
            int textLength = text.length();
            // Create an empty String to store the encode text
            String encodedText = "";
            // Iterate through each character
            for (int i = 0; i < textLength; i++)
            {
                char ch = text.charAt(i);
                // Check whether the character is a letter
                if (Character.isLetter(ch))
                {
                    // Check for special cases
                    if (ch == 'y')
                    {
                        ch = 'a';
                    }
                    else if (ch == 'Y')
                    {
                        ch = 'A';
                    }
                    else if (ch == 'z')
                    {
                        ch = 'b';
                    }
                    else if (ch == 'Z')
                    {
                        ch = 'B';
                    }
                    // If its not a special case
                    else
                    {
                        ch += 2;
                    }
                }
                // Add modified letter to the encoded string
                encodedText += ch;
            }
            // Display the encoded text
            System.out.println("Encoded text: " + encodedText);
        }
    }
}