package basics;

public class MathClass {
    public static void main(String[] args) {
        float num = 5.6f;
        System.out.println(num);
        //rounding down
        System.out.println("Floor: " + Math.floor(num));
        //rounding up
        System.out.println("Ceil: " + Math.ceil(num));
        //rounding according to Math rules
        System.out.println("Round: " + Math.round(num)); //izdod integer tipu
        //ABS - absolute value
        System.out.println("ABS: " + Math.abs(num));
        //power
        System.out.println("Power: " + Math.pow(num, 2));
        //Max
        System.out.println("Max: " + Math.max(num, 5.99));
        //min
        System.out.println("Min: " + Math.min(num, 5.99));
        //max out of three values
        System.out.println("Max out of three: " + Math.max(Math.max(14, 18), 10));
    }
}
