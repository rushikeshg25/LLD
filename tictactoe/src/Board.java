public class Board {
    private final char[][] grid;
    private int movesCnt;

    public Board(){
        grid=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]='_';
            }
        }
        movesCnt=0;
    }

    public boolean isFull(){
        return movesCnt==9;
    }

    public void makeMove(int r,int c,char s){
        if(r<0 || c<0 || r>=3 || c>=3 || grid[r][c]!='_'){
            throw new IllegalArgumentException("Invalid Move");
        }
        grid[r][c]=s;
        movesCnt++;
    }

    public void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean hasWinner() {
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] != '-' && grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2]) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (grid[0][col] != '-' && grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col]) {
                return true;
            }
        }
        if (grid[0][0] != '-' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return true;
        }
        return grid[0][2] != '-' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0];
    }

}
