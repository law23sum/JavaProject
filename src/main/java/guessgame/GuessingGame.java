package guessgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame {
    public static void main(String[] args) {
        GuessingGame theGame = new GuessingGame();                                                                      // an instance
        theGame.newGame(0, 100);
    }

    public GuessingGame() {                                                                                             // constructor
        setContentPane(mainPanel);
        setSize(new Dimension(600, 300));
        setVisible(true);
        betweenGuess.addActionListener(new ActionListener() {                                                           // anonymous inner class
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    public void newGame(int min, int max) {
        theNumber = (int) (Math.random() * (max-min+1)) + min;
    }

    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        int guess = Integer.parseInt(guessText);
        ++total;
        if (guess < theNumber)
            message = guess + " too low. try again.";
        else if (guess > theNumber)
            message = guess + " too high. try again.";
        else
            message = guess + " is correct. total guesses: " + total;
        labelOutput.setText(message);
    }

    private int theNumber, total;
    private JButton betweenGuess;
    private JTextField txtGuess;                                                                                        // user input via gui                                                                                        // super||parent class: extends JFrame
    private JLabel labelOutput;                                                                                         // display output via gui
    private JPanel mainPanel;
}