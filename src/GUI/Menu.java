package GUI;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public void LoadMenu(){
        JFrame menu = new JFrame("Password Generator/Getter");

        JPanel Text = new JPanel();
        JLabel text = new JLabel("You're welcome, choose your option");
        Text.setSize(100, 100);
        Text.add(text);

        JPanel Buttons = new JPanel(new FlowLayout());
        JButton Generate = new JButton("Generate Password");
        JButton Get = new JButton("Get Password");

        // Set preferred button size to make them proportional
        Dimension buttonSize = new Dimension(160, 50);
        Generate.setPreferredSize(buttonSize);
        Get.setPreferredSize(buttonSize);

        Generate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                SocialMedia choose = new SocialMedia();
                choose.ChooseToCreatePassword();
                menu.setVisible(false);
            }
        });

        Get.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                SocialMedia choose = new SocialMedia();
                choose.ChooseToGetPassword();
                menu.setVisible(false);
            }
        });

        Buttons.add(Get);
        Buttons.add(Generate);
        Buttons.setBorder(BorderFactory.createEmptyBorder(40, 10, 10, 10));

        menu.getContentPane().add(BorderLayout.NORTH , Text);
        menu.getContentPane().add(BorderLayout.CENTER , Buttons);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 400, 400, 200);
        menu.setVisible(true);
    }
}
