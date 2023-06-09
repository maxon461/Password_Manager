package GUI;

import Password_Generator.*;
import java.util.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import file_work.*;


public class Login_GetPassword {
    public void Login(String social_media ){
        JFrame menu = new JFrame("Password Getter");

        JPanel Text = new JPanel(new FlowLayout());
        JLabel text = new JLabel("Type you'r login here");
        Text.setSize(100, 100);
        JTextField log = new JTextField();
        log.setPreferredSize(new Dimension(200, 30));
        
        Text.add(text);
        Text.add(log);

        JPanel Buttons = new JPanel(new FlowLayout());
        
        JButton Get = new JButton("Get Password");

        // Set preferred button size to make them proportional
        Dimension buttonSize = new Dimension(160, 50);
        
        Get.setPreferredSize(buttonSize);

        Get.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                findPassword f = new findPassword();
                f.find(social_media, log.getText());
                Menu start = new Menu();
                start.LoadMenu();
                menu.setVisible(false);
            }
        });

        Buttons.add(Get);
        
        Buttons.setBorder(BorderFactory.createEmptyBorder(40, 10, 10, 10));

        menu.getContentPane().add(BorderLayout.NORTH , Text);
        menu.getContentPane().add(BorderLayout.CENTER , Buttons);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 400, 400, 200);
        menu.setVisible(true);
        
    }
    
}
