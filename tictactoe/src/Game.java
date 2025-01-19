import java.util.Scanner;

public class Game {
    private final Player p1;
    private final Player p2;
    private final Board board;
    private Player currentPlayer;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.board = new Board();
        this.currentPlayer = p1;
    }

    public void nextTurn(){
        currentPlayer=(currentPlayer==p1)?p2:p1;
    }

    public void play() {
        board.printBoard();

        while (!board.isFull() && !board.hasWinner()) {
            System.out.println(currentPlayer.getName() + "'s turn.");
            int row = getValidInput("Enter row (0-2): ");
            int col = getValidInput("Enter column (0-2): ");

            try {
                board.makeMove(row, col, currentPlayer.getSymbol());
                board.printBoard();
                nextTurn();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if (board.hasWinner()) {
            nextTurn();
            System.out.println(currentPlayer.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private int getValidInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0 && input <= 2) {
                    return input;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input! Please enter a number between 0 and 2.");
        }
    }
}
