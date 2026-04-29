package gui;

import javax.swing.JFrame;

public class WordleGUI {
    /**
     * Creates a new WordleGUI.
     */
    public WordleGUI() {
        JFrame f = new JFrame("Wordle GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(800, 600);
	f.setVisible(true);
    }

    /**
     * The main method to start the program.
     * 
     * @param args None required
     */
    public static void main(String[] args) {
	new WordleGUI();
    }
}
