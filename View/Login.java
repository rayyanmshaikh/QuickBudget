package View;

import Styling.Style;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {

    public Login(OverFrame frame) {
        setLayout(null);

        JLabel l1 = new JLabel("<html><h2>Username:</h2></html>");
        l1.setBounds(220,300, 130,30);
        final JTextField text = new JTextField();
        text.setBounds(320,302, 170,30);
        text.setFont(Style.font);

        JLabel l2=new JLabel("<html><h2>Password:</h2></html>");
        l2.setBounds(220,370, 130,30);
        final JPasswordField value = new JPasswordField();
        value.setBounds(320,372,170,30);
        value.setFont(Style.font);

        JButton b = Style.styleButton("Login", 30);
        b.setBounds(320,440, 120,35);
        b.addActionListener(e -> {System.out.println("ds");});

        JButton sign = Style.styleButton("Sign-in Instead", 15);
        sign.setBounds(310,510, 150,50);
        sign.addActionListener(e -> {frame.next(new SignIn(frame));});

        add(value); add(l1); add(l2); add(b); add(text); add(sign);
    }

    @Override
    public String toString() {
        return "Login";
    }
}
