// TODO: Write a brief program description
import java.util.*;

class Calculator
{
    public static void main(String args[])
    {
        // Input expression from user
        // trim() removes white spaces from both the ends of string
        String expression = input().trim();

        float num1, num2, answer;
        char operator;

        // Calculate length of expression
        int length = expression.length();

        // Create temporary String variable
        String word = "";

        // Find numbers and operator in expression
        for (int i = 0; i < length; i++)
        {
            // TODO: Extract character at index i
            char ch = ;
            // If you encounter a space it means end of a number/operator
            if (ch == ' ')
            {
                // Check if the formed word is not a digit
                if (! Character.isDigit(word[0]))
                {
                    operator = word;
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
            }
            // Check if reached the end of String
            if (i == lenght - 1)
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
        }

        // TODO: Display answer
    }

    // Input String expression form user
    public static String input()
    {
        // TODO: Prompt user to enter

        // TODO: Input number

        return expression;
    }

    // Add two numbers
    public static float add(float num1, float num2)
    {

    }

    // Subtract two numbers
    public static float subtract(float num1, float num2)
    {
        // TODO: Calculate difference

        // TODO: Return answer
    }

    // Multiply two numbers
    public static float multiply(float num1, float num2)
    {
        // TODO: Calculate product

        // TODO: Return answer
    }

    // Divide two numbers
    public static float divide(float num1, float num2)
    {
        // TODO: Calculate quotient

        // TODO: Return answer
    }

    // Display calculated answer
    public static void display(float answer)
    {
        // TODO: Print answer
    }
}
