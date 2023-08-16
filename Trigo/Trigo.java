// Write a brief program description
import java.util.*;

class Trigo
{
    public static void main(String args[])
    {
        String expression = "";
        try (Scanner sc = new Scanner(System.in))
        {
            // Prompt user to enter input
            System.out.print("Enter input: ");
            
            // Input expression
            expression = sc.nextLine().trim();
        }
        
        // Create object
        Trigo obj = new Trigo();
        
        // Use object to call calculate(), pass String as argument and store returned answer in float variable
        float answer = (float) obj.calculate(expression);

        // Display answer by calling display() and passing answer as argument
        obj.display(answer);
    }

    // Calculates the value
    double calculate(String expression)
    {
        double answer = 0.0;
        
        // Find length of String
        int length = expression.length();

        String function = "", word = "";
        double angle = 0.0;
        
        // Traverse through String and find the function and angle
        int i = 0;
        while (i < length)
        {
            // Extract character
            char ch = expression.charAt(i);

            /* Store function name in variable if blank space is encountered.
               Also reset word to blank */
            if (ch == ' ')
            {
                function = word;
                word = "";
            }

            word += ch;
            
            // If end of expression reached
            if (i == length - 1)
            {
                // Convert the angle in degrees from String to double
                angle = Double.parseDouble(word);
                
                // Convert the angle in degrees to radians
                angle = Math.toRadians(angle);
                
                word = "";
            }
            i++;
        }

        switch(function)
        {
            case "sin":
                // Calculate sine value for angle and store in answer
                answer = Math.sin(angle);
                break;
            // Write other cases
            case "cos":
                answer = Math.cos(angle);
                break;
            case "tan":
                answer = Math.tan(angle);
                break;
            case "cot":
                answer = 1 / Math.tan(angle);
                break;
            case "cosec":
                answer = 1 / Math.sin(angle);
                break;
            case "sec":
                answer = 1 / Math.cos(angle);
                break;
            default:
                System.out.println("\nWrong trigonometric function.");
        }
        
        return answer;
    }
    
    // Display value of trigonometric function
    void display(float answer)
    {
        // Truncate float upto two decimal places and store in a String variable
        String ans = String.format("%.2f", answer);
        System.out.println(ans);
    }
}
