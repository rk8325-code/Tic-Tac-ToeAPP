import java.util.Random;

public class TicTacToeAPP {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        Random random = new Random();

        int tossResult = random.nextInt(2); // 0 or 1
        if (tossResult == 0) {
            isHumanTurn = false;
            computerSymbol = 'X';
            humanSymbol = 'O';
        } else {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss and will play first.");
            System.out.println("Human is '" + humanSymbol + "', Computer is '" + computerSymbol + "'");
        } else {
            System.out.println("Computer won the toss and will play first.");
            System.out.println("Computer is '" + computerSymbol + "', Human is '" + humanSymbol + "'");
        }
    }
}
