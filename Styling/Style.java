package Styling;

import javax.swing.*;
import java.awt.*;

public class Style {
    public static Font font = new Font("Arial", Font.BOLD, 30); //Common font

    /**
     * Creating a styled button
     * @param text The button text
     * @return A styled button
     */
    public static JButton styleButton(String text, int size) {
        JButton button = new JButton(text);
        button.setBackground(Color.WHITE);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setFont(new Font("Arial", Font.BOLD, size));
        return button;
    }
}
