package ludogame;
import java.util.*;

public class LudoGame {
    private static final int NUM_PLAYERS = 4;
    private static final int NUM_PIECES = 4;
    private static final int NUM_SQUARES = 52;
    private static final int WINNING_SQUARE = 51;

    private static final String[] PLAYER_COLORS = {"RED", "GREEN", "BLUE", "YELLOW"};

    private int[] board;
    private Player[] players;
    private int currentPlayerIndex;

    public LudoGame() {
        board = new int[NUM_SQUARES];
        players = new Player[NUM_PLAYERS];
        currentPlayerIndex = 0;

        // Initialize board
        for (int i = 0; i < NUM_SQUARES; i++) {
            board[i] = -1; // -1 means no player's piece is on this square
        }

        // Initialize players
        for (int i = 0; i < NUM_PLAYERS; i++) {
            players[i] = new Player(PLAYER_COLORS[i]);
        }
    }

    public void playGame() {
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println("It's " + currentPlayer.getColor() + "'s turn.");
            System.out.println("Press enter to roll the dice...");
            scanner.nextLine();

            int diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll + ".");

            // Move the current player's piece
            movePiece(currentPlayer, diceRoll);

            // Check if the current player has won
            if (currentPlayer.hasWon()) {
                System.out.println(currentPlayer.getColor() + " has won the game!");
                gameOver = true;
            }

            // Move to the next player
            currentPlayerIndex = (currentPlayerIndex + 1) % NUM_PLAYERS;
        }

        scanner.close();
    }

    private int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // Returns a random number between 1 and 6
    }

    private void movePiece(Player player, int steps) {
        // Logic for moving the piece goes here
        // This is a basic implementation and would need to handle rules, collisions, etc.
    }

    private class Player {
        private String color;
        private List<Integer> pieces;

        public Player(String color) {
            this.color = color;
            pieces = new ArrayList<>();
            for (int i = 0; i < NUM_PIECES; i++) {
                pieces.add(0); // Initialize all pieces at start position (square 0)
            }
        }

        public String getColor() {
            return color;
        }

        public boolean hasWon() {
            for (int piece : pieces) {
                if (piece != WINNING_SQUARE) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LudoGame game = new LudoGame();
        game.playGame();
    }
}
