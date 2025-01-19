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

    private int getInput(String msg){
        Scanner scanner=new Scanner(System.in);
        
    }
}
