package file_work;
import java.util.*;
import java.io.*;
import GUI.*;
import SocialMedia_Acc.Account;
public class findPassword {
    public void find(String social_media , String login){
        try {

            FileInputStream fos = new FileInputStream(social_media + ".txt");
            ObjectInputStream out = new ObjectInputStream(fos);
            int res = 0;
           
              ArrayList<Account> accs = ((ArrayList<Account>) out.readObject());
            for(Account acc : accs){
            if(acc.getLogin().equals(login)) {
              System.out.println(acc.getPassword());
              res++;
            }
            }

          
              out.close();
              fos.close();
              

            
      
          } catch (ClassNotFoundException | IOException e ) {
            System.out.println("Blad");
            e.printStackTrace();
          }
    }
    
}
