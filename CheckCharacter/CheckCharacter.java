// Program finds whether a character is a digit or an alphabet(also states it's case).
import java.io.*;
class CheckCharacter
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character");
        char c = (char) br.read();
        int n = c;
        if (n >= 65 && n <= 90)
           System.out.println("Uppercase alphabet");
        else if (n >= 97 && n <= 122)
            System.out.println("Lowercase alphabet");
        else if (n >= 48 && n <= 57)
            System.out.println("Digit");
        else
           System.out.println("It is a symbol");
    }
}