package View;

import javax.swing.*;
import java.awt.*;

/**
 * The class controlling the overall frame
 */
public class OverFrame extends JFrame{
    JPanel cards;
    CardLayout layout; //The overall layout to shift through

    public OverFrame() {
        cards = new JPanel();
        layout = new CardLayout();
        cards.setLayout(layout);
        cards.add(new Start(this), "Start");
        add(cards);

        setTitle("QuickBudget");
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
    }

    /**
     * Creating and shifting to different panels
     * @param panel The panel to create or shift to
     */
    public void next(JPanel panel) {
        Container curr = getContentPane();
        layout.show(cards, panel.toString());
        if(curr.equals(getContentPane())) { //Checks if the panel is already in the CardLayout
            cards.add(panel, panel.toString());
            layout.show(cards, panel.toString());
        }
    }
}
