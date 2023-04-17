package oop;

public class ExceptionExample {
    public static void main(String[] args) {
        //exceptions gives us the clue what is wrong in our code
        //to catch problems we put them in try-catch block
        try{
            int [] num = {1, 2, 3};
            System.out.println(num[3]);
        }catch (Exception e){
            System.out.println("Something was wrong!");
            System.out.println(e); //gives us the problem description without error message
        }

        //multiple catch blocks
        try{
            //int num1 = 5/0;
            int[] num = {1,2,3,4};
            System.out.println(num[4]);
        }catch (ArithmeticException | OutOfMemoryError e){
            System.out.println("There was problem with some math operations");
            System.out.println("Exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something was wrong with Array's index");
        }catch (Exception e){
            System.out.println("Something was wrong");
        }finally { //nostrādās vienmēr
            System.out.println("Finally block");
        }



    }
}
