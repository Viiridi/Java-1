package pojos;

public class NumberGuessGame {

    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int MAX_GUESSES = 7;

    public int magicNumber = (int) ((Math.random() * MAX) + MIN);
    public int numGuesses;
    public boolean over;

    public String guess(int number) {
        numGuesses++;
        String message;
        if (number == magicNumber) {
            over = true;
            message = "VICTORY!";
        } else if (number > magicNumber) {
            message = "Too high!";
        } else {
            message = "Too low!";
        }

        if (numGuesses == MAX_GUESSES && !over){
            over = true;
            message = message + "\nYou're out of guesses - YOU LOSE! It was " + magicNumber;
        }
        return message;
    }
}
