import java.util.*;

class Calculator
{
    public static void main(String args[])
    {
        // Input expression from user
        String expression = input();

        float num1, num2;
        char operator;

        // Calculate length of expression
        int length = expression.length();

        // Iterate through the entire expression to find numbers and operator
        for (int i = 0; i < length; i++)
        {
            // Extract character at index i
            char ch = expression.charAt(i);
            
            if (ch == ' ')
            {
                // Check if the formed word
                if (! Character.isDigit(word))
                {
                    operator = word;
                    word = "";
                }
                else
                {
                    num1 = word;
                    word = "";
                }
            }
            String word += ch;
            word
        }
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

    }

    // Multiply two numbers
    public static float multiply(float num1, float num2)
    {

    }

    // Divide two numbers
    public static float divide(float num1, float num2)
    {

    }

    // Display calculated answer
    public static void display(float answer)
    {

    }
}
