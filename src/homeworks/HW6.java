package homeworks;

public class HW6 {
    public static void main(String[] args) {
        /*        Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.*/

        int i = 65;
        int j = 97;
        do {
            System.out.print((char) i);
            i++;
            System.out.println((char) j);
            j++;
        } while ((i <= 90) && (j <= 122));


        //solution 2 - izmanto for loop jo zinām, cik reizes cikls jāatkārto - zināma beigu vērtība i - labāks risinājums - mazāk rindas.
        for (int k = 65; k <= 90; k++) {
            System.out.println((char) k);
        }
    }

}
