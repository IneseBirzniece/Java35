package homeworks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");
        Float speed = scanner.nextFloat();
        float s, c;
        c=1.609344f;
        s = c * speed;
        System.out.println("Speed is " + s + " km/h");

    }
}
