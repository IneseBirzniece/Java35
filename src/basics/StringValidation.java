package basics;

public class StringValidation {
    public static void main(String[] args) {

        //check if this text is equal to "Bike" or "Car" or "Plane"

        String text = "Bike";
        System.out.println(text.equals("Bike") || text.equals("Car") || text.equals("Plane"));
        System.out.println(text.matches("Bike|Car|Plane"));
    }
}
