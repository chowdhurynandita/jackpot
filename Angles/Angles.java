// Find all angles of a quadrilateral using ratio of angles
public class Angles
{
    public static void main(String args[])
    {
        // Define ratios
        int a = 3, b = 4, c = 5, d = 6;
        
        // Find sum of ratio
        int sum = a + b + c + d;
        
        // Find factor
        int factor = 360 / sum;

        // Find 4 angles
        int angle1 = a * factor;
        int angle2 = b * factor;
        int angle3 = c * factor;
        int angle4 = d * factor;

        // Display angles
        System.out.println("The angles of the quadrilateral:\n"
                            + angle1 + "°\t" + angle2 + "°\t" +
                            angle3 + "°\t" + angle4 + "°");
    }
}