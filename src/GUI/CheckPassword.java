package GUI;

import Password_Generator.*;
import file_work.*;
import java.util.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Password_Generator.*;
import SocialMedia_Acc.*;



public class CheckPassword {
    Account acc ;


    public void isGoodPassword(String social_media , String mail ){
        JFrame menu = new JFrame("Password Genertor");


        Generator gen = new Generator();

        JPanel Text = new JPanel(new BorderLayout());
        String password = gen.generatePassword(8, 12);
        JLabel text = new JLabel("Your   "+ social_media + " password will be :   "+ password + "    do you accept this one?");
        Text.setSize(100, 100);
         
        Text.add(text);
       

        JPanel Buttons = new JPanel(new FlowLayout());
        
        JButton yesButoon = new JButton("Yes");
        JButton noButon = new JButton("No , generate new one");
        JButton cancel = new JButton("Cancel Password Generation");

        // Set preferred button size to make them proportional
        Dimension buttonSize = new Dimension(160, 50);
        noButon.setPreferredSize(buttonSize);
        yesButoon.setPreferredSize(buttonSize);
        cancel.setPreferredSize(new Dimension(200,50));

        
        //Action Listeners
        
        yesButoon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                acc = new Account(mail, password);
                loadAccount loadacc = new loadAccount();
                loadacc.load(acc , social_media);
                Menu start = new Menu();
                start.LoadMenu();
                menu.setVisible(false);
                
            }
        });




        noButon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                isGoodPassword(social_media ,  mail);
            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Menu start = new Menu();
                start.LoadMenu();
                menu.setVisible(false);
            }
        });


       

        Buttons.add(yesButoon);
        Buttons.add(noButon);
        Buttons.add(cancel);
        
        Buttons.setBorder(BorderFactory.createEmptyBorder(40, 10, 10, 10));

        menu.getContentPane().add(BorderLayout.NORTH , Text);
        menu.getContentPane().add(BorderLayout.CENTER , Buttons);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 400, 500, 200);
        menu.setVisible(true);
        
    }
    
}
