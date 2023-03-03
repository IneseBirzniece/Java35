package tasks;

import java.util.Scanner;

public class CapitalQuiz2 {
    public static void main(String[] args) {
        String[][] quizArray = new String[4][4];
        int[] quizAnswers = {1, 3, 1, 2};
        Scanner scanner = new Scanner(System.in);

        quizArray[0][0] = "Capital city of Latvia?";
        quizArray[0][1] = "Riga";
        quizArray[0][2] = "Liepaja";
        quizArray[0][3] = "Jurmala";

        quizArray[1][0] = "Capital city of Canada?";
        quizArray[1][1] = "Halifax";
        quizArray[1][2] = "Toronto";
        quizArray[1][3] = "Ottawa";

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Brasilia";
        quizArray[2][2] = "San Paulo";
        quizArray[2][3] = "Rio de Janeiro";

        quizArray[3][0] = "Capital city of Australia?";
        quizArray[3][1] = "Sydney";
        quizArray[3][2] = "Cannbera";
        quizArray[3][3] = "Melbourne";




        //i - row
        //j - column
        for(int i = 0; i < quizArray.length; i++){

            //Print out question
            System.out.println(quizArray[i][0]);

            for (int j = 1 ; j < quizArray[i].length; j++){
                //Print out answers
                System.out.println("\t" + j + ") " + quizArray[i][j]);
            }

            System.out.println("Answer (1-3):");
            int answerInput = scanner.nextInt();

        }
    }
}
