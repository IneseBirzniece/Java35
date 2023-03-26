package homeworks;

import java.util.Scanner;

public class HW15 {
    private String player1;
    private String player2;
    public void setPlayer1(String player1) {
        this.player1 = player1;
    }
    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
    public String getPlayer1() {
        return player1;
    }
    public String getPlayer2() {
        return player2;
    }

    //Method for rock, paper, scissors
    //public static String rockPaperScissors (String player1, String player2){
    public void rockPaperScissors() {
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

            if ((((player1.equals(rock)) && (player2.equals(scissors))) || ((player1.equals(paper)) && (player2.equals(rock))) || ((player1.equals(scissors)) && (player2.equals(paper))))) {
                System.out.println("Player 1 wins");
            } else if ((((player2.equals(rock)) && (player1.equals(scissors))) || ((player2.equals(paper)) && (player1.equals(rock))) || ((player2.equals(scissors)) && (player1.equals(paper))))) {
                System.out.println("Player 2 wins");
            } else if((((player2.equals(rock)) && (player1.equals(rock))) || ((player2.equals(paper)) && (player1.equals(paper))) || ((player2.equals(scissors)) && (player1.equals(scissors))))){
                System.out.println("Tie");
            }else{
                System.out.println("Invalid input");
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, please enter your choice: ");
        String player1 = scanner.nextLine().toLowerCase();
        System.out.println("Player 2, please enter your choice: ");
        String player2 = scanner.nextLine().toLowerCase();

        String rock, paper, scissors;

        HW15 rockPaperScissors1 = new HW15();
        rockPaperScissors1.setPlayer1(player1);
        rockPaperScissors1.setPlayer2(player2);

        rockPaperScissors1.rockPaperScissors();

    }
}
