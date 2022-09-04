import javax.swing.*;
public class GuessingGame extends JFrame {
    public static void main(String[] args) {
        // TO DO
        System.out.println("this is a print statement");
    }

    private JTextField txtGuess;                                                                              // superclass || parentclass - JFrame
    private JLabel lblOutput;
    private int theNumber;
    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        int guess = Integer.parseInt(guessText);
    }
}