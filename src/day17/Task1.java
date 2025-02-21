package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPies[] chessPies = {ChessPies.PAWN_WHITE, ChessPies.PAWN_WHITE, ChessPies.PAWN_WHITE, ChessPies.PAWN_WHITE,
                ChessPies.ROOK_BLACK, ChessPies.ROOK_BLACK, ChessPies.ROOK_BLACK, ChessPies.ROOK_BLACK};
        for (ChessPies chess : chessPies) {
            System.out.print(chess.getRepresentetion()+" ");
        }
    }

}
