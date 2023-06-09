package file_work;

import SocialMedia_Acc.*;
import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class loadAccount {
    public void load(Account acc, String social_media) {
        ArrayList<Account> accs = new ArrayList<>();
        try {

            FileInputStream ifos = new FileInputStream(social_media + ".txt");
            ObjectInputStream iout = new ObjectInputStream(ifos);
            ArrayList<Account> accs1 = ((ArrayList<Account>) iout.readObject());

            FileOutputStream fos = new FileOutputStream(social_media + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            accs.addAll(accs1);
            accs.add(acc);

            out.writeObject(accs);
            out.close();
            fos.close();

        } catch (IOException | ClassNotFoundException a) {
            a.printStackTrace();
        }

        System.out.println("Loaded!");

    }
};
