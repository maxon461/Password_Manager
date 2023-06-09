package GUI;

import Password_Generator.*;
import java.util.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_GeneratePassword {
    public void Login(String social_media) {
        JFrame menu = new JFrame("Password Generator");

        JPanel Text = new JPanel(new FlowLayout());
        JLabel text = new JLabel("Type you'r login here");
        Text.setSize(100, 100);
        JTextField log = new JTextField();
        log.setPreferredSize(new Dimension(200, 30));

        Text.add(text);
        Text.add(log);

        JPanel Buttons = new JPanel(new BorderLayout());

        JButton Get = new JButton("Get Password");

        // Set preferred button size to make them proportional
        Dimension buttonSize = new Dimension(160, 50);

        Get.setPreferredSize(buttonSize);

        Get.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkmail(log.getText())) {
                    CheckPassword check = new CheckPassword();
                    check.isGoodPassword(social_media , log.getText());
                    menu.setVisible(false);
                } else {
                    log.setText("invalid mail type ");
                    text.setForeground(Color.RED);
                    
                    menu.repaint();
                }
            }
        });

        Text.add(text);
        Text.add(log);

        Buttons.add(Get);

        Buttons.setBorder(BorderFactory.createEmptyBorder(40, 10, 10, 10));

        menu.getContentPane().add(BorderLayout.NORTH, Text);
        menu.getContentPane().add(BorderLayout.SOUTH, Buttons);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 400, 400, 200);
        menu.setVisible(true);

    }

    public static boolean checkmail(String str) {
        if (str.contains(".com") && str.contains("@")) {
            return true;
        } else
            return false;
    }
}
