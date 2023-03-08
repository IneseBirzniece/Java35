package basics;

public class PrintFormatting {
    public static void main(String[] args) {

        //s - string
        //d - integer
        //f - float/double
        //c - char
        //b - boolean

        String name = "Bob";
        int age = 34;


        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("Hello %s your age is %d \n", name, age);
        // \n beigās dod jaunu rindu

        double height = 192.5485435d;
        System.out.printf("%s is %.2f cm tall \n" , name, height);

        // %.2f norāda 2 ciparus aiz komata - apaļo pēc matemātikas likumiem

        // Hello Bob your age is 34 and your age is 192.55 cm. ..... Good job Bob!
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$.2f. Good job %1$s. \n", name, age, height);

        // %1$s formatējums jāizmanto visos gadījumos




    }
}
