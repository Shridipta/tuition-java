import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        printBoard(board);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            playerMove(board, scanner);
            printBoard(board);

            if (isGameOver(board)) {
                break;
            }

            aiMove(board);
            printBoard(board);

            if (isGameOver(board)) {
                break;
            }
        }

        scanner.close();
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    static boolean isGameOver(char[][] board) {
        if (checkWin(board, 'X')) {
            System.out.println("Player wins!");
            return true;
        }
        if (checkWin(board, 'O')) {
            System.out.println("AI wins!");
            return true;
        }
        if (isBoardFull(board)) {
            System.out.println("It's a draw!");
            return true;
        }
        return false;
    }

    static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        return board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol;
    }

static void playerMove(char[][] board, Scanner scanner) {
        int row, col;
        do {
            System.out.print("Enter your move (row [1-3] and column [1-3]): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ');

        board[row][col] = 'X';
    }

    static void aiMove(char[][] board) {
        int[] bestMove = minimax(board, 'O', Integer.MIN_VALUE, Integer.MAX_VALUE);
        int row = bestMove[0];
        int col = bestMove[1];
        
        board[row][col] = 'O';
        System.out.println("AI chose row " + (row + 1) + " and column " + (col + 1));
    }

    static int[] minimax(char[][] board, char player, int alpha, int beta) {
        if (checkWin(board, 'X')) {
            return new int[] { -1, -1, Integer.MIN_VALUE };
        }
        if (checkWin(board, 'O')) {
            return new int[] { -1, -1, Integer.MAX_VALUE };
        }
        if (isBoardFull(board)) {
            return new int[] { -1, -1, 0 };
        }
    
        int[] bestMove = new int[] { -1, -1, (player == 'O') ? Integer.MIN_VALUE : Integer.MAX_VALUE };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    int[] currentMove = minimax(board, (player == 'X') ? 'O' : 'X', alpha, beta);
                    board[i][j] = ' ';
                    
                    if ((player == 'O' && currentMove[2] > bestMove[2]) ||
                        (player == 'X' && currentMove[2] < bestMove[2])) {
                        bestMove[0] = i;
                        bestMove[1] = j;
                        bestMove[2] = currentMove[2];
                    }
                    
                    if (player == 'O') {
                        alpha = Math.max(alpha, currentMove[2]);
                    } else {
                        beta = Math.min(beta, currentMove[2]);
                    }
                    
                    if (alpha >= beta) {
                        return bestMove;
                    }
                }
            }
        }
        
        return bestMove;
    }
    

    static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}