import java.util.Scanner;

public class TicTacToe2 extends TicTacToe {

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            char currentPlayer;
            if (currentPlayer == 'X') {
                System.out.println("Player X, enter a position (1-9): ");
                int position = scanner.nextInt();
                while (!isPositionAvailable(position)) {
                    System.out.println("Position already taken, try again: ");
                    position = scanner.nextInt();
                }
                placeMove(position);
            } else {
                int position = findWinningMove('O');
                if (position == -1) {
                    position = findWinningMove('X');
                    if (position == -1) {
                        do {
                            position = (int) (Math.random() * 9) + 1;
                        } while (!isPositionAvailable(position));
                    }
                }
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

    private int findWinningMove(char player) {
        for (int i = 1; i <= 9; i++) {
            if (isPositionAvailable(i)) {
                placeMove(i);
                if (checkWin()) {
                    undoMove(i);
                    return i;
                }
                undoMove(i);
            }
        }
        return -1;
    }

    private void undoMove(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        char[][] board;
        board[row][col] = (char) ('1' + (position - 1));
    }

    public static void main(String[] args) {
        TicTacToe2 game = new TicTacToe2();
        game.play();
    }
}

