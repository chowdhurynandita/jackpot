// Program converts temperature from fahrenheit to degree celsius
import java.util.*;
 class Temprature
 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            // Prompt user for input
            System.out.print("Fahrenheit: ");
            // Input temperature
            float fahrenheit = sc.nextFloat();
            // Convert to degree celcius
            float celcius = (fahrenheit - 32) * 5 / 9;
            // Display temperature
            System.out.println("The temperature in degree celcius is " + celcius  + "°C");
        }
    }
}    