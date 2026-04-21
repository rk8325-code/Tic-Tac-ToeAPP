import java.util.Scanner;

public class TicTacToeAPP {

    /**
     * Entry point of the program.
     * Reads slot input and prints it back.
     */
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1–9)
     * Note: Validation will be added in later use cases.
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a slot number (1–9): ");
        int slot = scanner.nextInt();
        scanner.close();
        return slot;
    }
}