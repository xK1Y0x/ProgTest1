import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = (char) ('1' + (i * 3 + j));
            }
        }
    }

    public void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isPositionAvailable(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        return board[row][col] != 'X' && board[row][col] != 'O';
    }

    public void placeMove(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        board[row][col] = currentPlayer;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            if (currentPlayer == 'X') {
                System.out.println("Player X, enter a position (1-9): ");
                int position = scanner.nextInt();
                while (!isPositionAvailable(position)) {
                    System.out.println("Position already taken, try again: ");
                    position = scanner.nextInt();
                }
                placeMove(position);
            } else {
                int position;
                do {
                    position = (int) (Math.random() * 9) + 1;
                } while (!isPositionAvailable(position));
                placeMove(position);
                System.out.println("Computer O placed at position " + position);
            }
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a tie!");
                return;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}

