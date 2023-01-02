package View;

import Styling.Style;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Start extends JPanel{

    public Start(OverFrame frame) {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1 style='font-size:60'><strong><i>QuickBudget</i></strong></h1><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel buttons = new JPanel(new GridBagLayout());
        JButton sign = Style.styleButton("Sign Up", 30);
        JButton login = Style.styleButton("Login", 30);
        sign.addActionListener(e -> {frame.next(new SignIn(frame));});
        login.addActionListener(e -> {frame.next(new Login(frame));});
        buttons.add(sign, gbc);
        buttons.add(login, gbc);

        gbc.weighty = 1;
        add(buttons, gbc);
    }
}
