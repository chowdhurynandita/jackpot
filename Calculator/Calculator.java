// TODO: Write a brief program description
import java.util.*;

class Calculator
{
    public static void main(String args[])
    {
        // Input expression from user
        // trim() removes white spaces from both the ends of string
        String expression = input().trim();

        float num1 = 0, num2 = 0, answer = 0;
        char operator=' ';

        // Calculate length of expression
        int length = expression.length();

        // Create temporary String variable
        String word = "";

        // Find numbers and operator in expression
        for (int i = 0; i < length; i++)
        {
            // TODO: Extract character at index i
            char ch = expression.charAt(i);
            // If you encounter a space it means end of a number/operator
            if (ch == ' ')
            {
                // Check if the formed word is not a digit
                if (! Character.isDigit(word.charAt(0)))
                {
                    operator = word.charAt(0);
                    // reset word
                    word = "";
                }
                else
                {
                    // Convert String to int and store as number
                    num1 = Integer.parseInt(word);
                    // reset word
                    word = "";
                }
            }
            else
            {
                // TODO: Concatenate character to word
                word += ch;
            }
            // Check if reached the end of String
            if (i == length - 1)
            {
                // Convert String to int and store as number
                num2 = Integer.parseInt(word);
                // reset word
                word = "";
            }
        }

        // Calculate answer
        switch(operator)
        {
            case '+':
                answer = add(num1, num2);
                break;

            // TODO: Write other cases
            case '-':
                answer = subtract(num1, num2);
                break;
                
            case '*':
                answer = multiply(num1, num2);
                break;
                
            case '/':
                answer = divide(num1, num2);
                break;

            default:
                System.out.println("WRONG INPUT!");
        }

        // TODO: Display answer
        display(answer);
    }

    // Input String expression form user
    public static String input()
    {
        Scanner sc = new Scanner(System.in);
        // TODO: Prompt user to enter
        System.out.println("Expression: ");
        String expression = sc.nextLine();

        return expression;
    }

    // Add two numbers
    public static float add(float num1, float num2)
    {
        return num1 + num2;
    }

    // Subtract two numbers
    public static float subtract(float num1, float num2)
    {
        return num1 - num2;
    }

    // Multiply two numbers
    public static float multiply(float num1, float num2)
    {
        return num1 * num2;
    }

    // Divide two numbers
    public static float divide(float num1, float num2)
    {
        return num1 / num2;
    }

    // Display calculated answer
    public static void display(float answer)
    {
        // TODO: Print answer
        System.out.println("Answer: " + answer);
    }
}
