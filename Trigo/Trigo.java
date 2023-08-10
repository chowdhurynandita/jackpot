// TODO: Write a brief program description
import java.util.*;

class Calculator
{
    public static void main(String args[])
    {
        // TODO: Prompt user to enter input
        
        // Input expression
        String expression = sc.nextLine().trim();

        // TODO: Create object
        
        // TODO: Use object to call calculate(), pass String as argument and store returned answer in float variable
        float answer = //....

        // Display answer by calling display() and passing answer as argument
        
    }

    // Calculates the value
    double calculate(String expression)
    {
        double answer = 0.0;
        
        // TODO: Find length of String
        int length = //....

        String function = "", word = "";
        float angle = 0.0;
        
        // Traverse through String and find the function and angle
        int i = 0;
        while (i < length)
        {
            // TODO: Extract character
            char ch = 

            /* TODO: Store function name in variable if blank space is encountered.
               Also reset word to blank */
            if (ch == ' ')
            {
                //....
            }

            word += ch;
            
            // If end of expression reached
            if (i == length - 1)
            {
                // Convert the angle in degrees from String to double
                angle = Double.parseDouble(word);
                
                // TODO: Convert the angle in degrees to radians
                angle = //....
                word = "";
            }
            i++;
        }

        switch(function)
        {
            case "sin":
                // TODO: Calculate sine value for angle and store in answer
                answer = //....
                break;

            // TODO: Write other cases
                
        }
        
        return answer;
    }
    
    // Display value of trigonometric function
    void display(float answer)
    {
        // TODO: display the value
    }
}
