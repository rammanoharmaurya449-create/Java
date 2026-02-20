import java.util.Scanner;

public class TicTacToe {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        boolean gameOver = false;

        while (!gameOver) {

            printBoard();
            System.out.print("Player " + currentPlayer + ", Enter slot (1-9): ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 9 || board[choice-1] == 'X' || board[choice-1] == 'O') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[choice-1] = currentPlayer;

            if (checkWin()) {
                printBoard();
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            else if (checkDraw()) {
                printBoard();
                System.out.println("Game Draw!");
                gameOver = true;
            }
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    static boolean checkWin() {
        return 
        (board[0]==board[1] && board[1]==board[2]) ||
        (board[3]==board[4] && board[4]==board[5]) ||
        (board[6]==board[7] && board[7]==board[8]) ||
        (board[0]==board[3] && board[3]==board[6]) ||
        (board[1]==board[4] && board[4]==board[7]) ||
        (board[2]==board[5] && board[5]==board[8]) ||
        (board[0]==board[4] && board[4]==board[8]) ||
        (board[2]==board[4] && board[4]==board[6]);
    }

    static boolean checkDraw() {
        for (char c : board) {
            if (c != 'X' && c != 'O')
                return false;
        }
        return true;
    }
}