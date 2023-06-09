package GUI;

import Password_Generator.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SocialMedia {
    public void ChooseToGetPassword(){
        JFrame menu = new JFrame("Password Generator/Getter");
    
        JPanel Text = new JPanel();
        JLabel text = new JLabel("Choose which media do ou need ;)");
        Text.add(text);
        
        JPanel Buttons = new JPanel();

        Icon inst = new ImageIcon("Icons"+File.separator+"Instagram.png");
        JButton Instagram = new JButton(inst);
        Instagram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Login_GetPassword log = new Login_GetPassword();
                log.Login("Instagram");
                menu.setVisible(false);
            }
        });
        Buttons.add(Instagram);

        Icon tg = new ImageIcon("Icons" + File.separator +"Telegram.png");
        JButton telegram = new JButton(tg);
        telegram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Login_GetPassword log = new Login_GetPassword();
                log.Login("Telegram");
                menu.setVisible(false);
            }
        });
        
        Buttons.add(telegram);

        Icon tt = new ImageIcon("Icons"+ File.separator + "TikTok.png");
        JButton tiktok = new JButton(tt);
        tiktok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Login_GetPassword log = new Login_GetPassword();
                log.Login("TikTok");
                menu.setVisible(false);
            }
        });
        Buttons.add(tiktok);

        JPanel MText = new JPanel();
        JLabel Tinstagram = new JLabel("Instagram");
        JLabel Ttelegram = new JLabel("Telegram");
        JLabel Ttiktok = new JLabel("TikTok");

        MText.add(Tinstagram);
        MText.add(Box.createRigidArea(new Dimension(30,5))); 
        MText.add(Ttelegram);
        MText.add(Box.createRigidArea(new Dimension(33,5))); 
        MText.add(Ttiktok);

        MText.setBorder(BorderFactory.createEmptyBorder(10, 20, 35, 40));











        menu.getContentPane().add(BorderLayout.NORTH, Text);
        menu.getContentPane().add(BorderLayout.CENTER, Buttons);
        menu.getContentPane().add(BorderLayout.SOUTH, MText);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 400, 400, 200);
        menu.setVisible(true);
    }


    public void ChooseToCreatePassword(){
        JFrame menu = new JFrame("Password Generator/Getter");
    
        JPanel Text = new JPanel();
        JLabel text = new JLabel("Choose which media do ou need ;)");
        Text.add(text);
        
        JPanel Buttons = new JPanel();

        Icon inst = new ImageIcon("Icons"+File.separator+"Instagram.png");
        JButton Instagram = new JButton(inst);
        Instagram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Login_GeneratePassword login  = new Login_GeneratePassword();
                login.Login("Instagram");
                menu.setVisible(false);
            }
        });
        Buttons.add(Instagram);

        Icon tg = new ImageIcon("Icons" + File.separator +"Telegram.png");
        JButton telegram = new JButton(tg);
        telegram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Login_GeneratePassword login  = new Login_GeneratePassword();
                login.Login("Telegram");
                menu.setVisible(false);
            }
        });
        Buttons.add(telegram);

        Icon tt = new ImageIcon("Icons"+ File.separator + "TikTok.png");
        JButton tiktok = new JButton(tt);
        tiktok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Login_GeneratePassword login  = new Login_GeneratePassword();
                login.Login("TikTok");
                menu.setVisible(false);
            }
        });
        Buttons.add(tiktok);

        JPanel MText = new JPanel();
        JLabel Tinstagram = new JLabel("Instagram");
        JLabel Ttelegram = new JLabel("Telegram");
        JLabel Ttiktok = new JLabel("TikTok");

        MText.add(Tinstagram);
        MText.add(Box.createRigidArea(new Dimension(30,5))); 
        MText.add(Ttelegram);
        MText.add(Box.createRigidArea(new Dimension(33,5))); 
        MText.add(Ttiktok);

        MText.setBorder(BorderFactory.createEmptyBorder(10, 20, 35, 40));











        menu.getContentPane().add(BorderLayout.NORTH, Text);
        menu.getContentPane().add(BorderLayout.CENTER, Buttons);
        menu.getContentPane().add(BorderLayout.SOUTH, MText);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 400, 400, 200);
        menu.setVisible(true);
    }



    // public Icon getIcon(String path) throws Exception{
    //     Icon icon = new ImageIcon("C:\\Users\\MaksymSelishchev(273\\Desktop\\Password\\main\\Icons\\Instagram.png");
        
    //     return icon;
    // }
}
