package day17;

public class ChessBoard {
    private ChessPies[][] board;

    public ChessBoard(ChessPies[][] board) {
        this.board = board;
    }
    public void print(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j].getRepresentetion());
            }
            System.out.println();
        }
    }
}
