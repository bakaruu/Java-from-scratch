import java.util.Scanner;

public class Exercise4P_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

//        EXERCISE 4P
//        Two of the pieces in the game of chess are the bishop and the rook.
//        The bishop moves diagonally, while the rook moves horizontally
//        or vertically. A piece can be captured by another piece if it is on a
//        square to which the other piece can move. Assuming a board where the rows
//        and columns are numbered from 1 to 8, write a program that receives as
//        input the board positions of a bishop and a rook, and indicates which piece
//        captures the other:

//        Bishop rank: 7 Bishop column: 6 Rook row: 4 Rook column: 3
//        Bishop capture Bishop rank: 3 Bishop column: 4 Rook row: 7
//        Rook column: 4 Rook capture Rook: 4 Rook capture

        Scanner scanner = new Scanner(System.in);


        System.out.print("Bishop row (1–8): ");
        int bishopRow = scanner.nextInt();
        System.out.print("Bishop column (1–8): ");
        int bishopCol = scanner.nextInt();

        System.out.print("Rook row (1–8): ");
        int rookRow = scanner.nextInt();
        System.out.print("Rook column (1–8): ");
        int rookCol = scanner.nextInt();

        // Bishop capture condition → diagonal: difference of rows == difference of cols
        boolean bishopCaptures = Math.abs(bishopRow - rookRow) == Math.abs(bishopCol - rookCol);

        // Rook capture condition → same row or same column
        boolean rookCaptures = bishopRow == rookRow || bishopCol == rookCol;


        if (bishopCaptures) {
            System.out.println("✅ Bishop captures the rook.");
        } else if (rookCaptures) {
            System.out.println("✅ Rook captures the bishop.");
        } else {
            System.out.println("❌ Neither piece can capture the other.");
        }
    }
}
