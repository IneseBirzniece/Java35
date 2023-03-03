package tasks;

import java.util.Scanner;

public class CapitalQuiz {
    public static void main(String[] args) {
        String[][] quizArray = new String[4][4];

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

        int[] quizAnswers = {1, 3, 1, 2};
        int score = 0;


        for (int i = 0; i < quizArray.length; i++){
            for (int j = 0; j < quizArray[i].length; j++) {
                if (j == 0) {
                    System.out.println(quizArray[i][j]);
                } else {
                    System.out.println("    " + j + ")" + quizArray[i][j]);
                }

            }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Answer: ");
        int answerInput = scanner.nextInt();

            if(answerInput == quizAnswers[i]){
                System.out.println("Correct!");
                score++;
            }else {
                System.out.println("False :(");
            }

        }

        System.out.println("You answered correct to " + score + " questions :)");

    }
}
