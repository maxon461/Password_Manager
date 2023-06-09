package Password_Generator;
import java.util.*;
public class Generator {
    public static String generatePassword(int minLetters, int maxLetters) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        char[] symbolsArray = {'^', '@', '#', '*', '$', '&', '(', ')', '='};

        Random random = new Random();
        int passwordLength = random.nextInt(maxLetters - minLetters + 1) + minLetters; // choose a random length within the given bounds
        char[] password = new char[passwordLength]; // create an array to store the password

        // generate the password by randomly choosing elements from the three arrays
        for (int i = 0; i < passwordLength; i++) {
            int arrayIndex = random.nextInt(3);
            if (arrayIndex == 0) {
                // choose a random letter from charArray
                int letterIndex = random.nextInt(charArray.length);
                password[i] = charArray[letterIndex];
            } else if (arrayIndex == 1) {
                // choose a random number from intArray
                int numberIndex = random.nextInt(intArray.length);
                password[i] = Character.forDigit(intArray[numberIndex], 10);
            } else {
                // choose a random symbol from symbolsArray
                int symbolIndex = random.nextInt(symbolsArray.length);
                password[i] = symbolsArray[symbolIndex];
            }
        }

        String str = String.valueOf(password);
        // print the generated password
        return str;
    }
}


    

