import java.util.*;

public class RailFenceCipher {
    String str = "WeFoundYouRun"; // default message
    String en = "";
    String[][] arr;
    int rows=0;

    public void explain() {
        System.out.println("The Rail Fence Cipher is a simple transposition cipher that rearranges the letters of a message to make it harder to read.");
        System.out.println("To encrypt, the message is written in a zigzag pattern across several “rails” (rows).");
        System.out.println("Once the zigzag is complete, the letters are read row by row to form the encrypted text.");
        System.out.println("For example, with 3 rails, the message is written diagonally down and up in a repeating pattern.");
        System.out.println("This process changes the order of the characters without altering them, making the message appear scrambled.");
        System.out.println("To decrypt, the receiver reconstructs the zigzag pattern and reads the letters in their original order.");
    }

    public void encrypt() {
        arr = new String[rows][str.length()]; // Create a 2D array based on the rows and message length
        for (int i = 0; i < rows; i++) {
            Arrays.fill(arr[i], "_"); // Fill the array with underscores (empty spaces)
        }

        int row = 0;
        boolean goingDown = false;
        for (int i = 0; i < str.length(); i++) {
            arr[row][i] = String.valueOf(str.charAt(i));
            if (row == 0 || row == rows - 1) {
                goingDown = !goingDown;
            }
            row += goingDown ? 1 : -1; // Move down or up in the zigzag pattern
        }

        // Print the zigzag pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < str.length(); j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // Read the message row by row
        String encrypt="";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (!arr[i][j].equals("_")) {
                    encrypt+=arr[i][j];
                }
            }
        }

        System.out.println("Encrypted text: " + encrypt);
    }

    public void decrypt() {
    
    String cipher = str;

    for (int r = 2; r <= Math.min(cipher.length(), 10); r++) {
        System.out.println("Trying rails = " + r);

        // Step 1: Create pattern of zigzag positions
        boolean goingDown = false;
        int row = 0;

        char[][] pattern = new char[r][cipher.length()];
        for (char[] rowArr : pattern) {
            Arrays.fill(rowArr, '\n');
        }

        for (int i = 0; i < cipher.length(); i++) {
            pattern[row][i] = '*';

            if (row == 0 || row == r - 1) goingDown = !goingDown;
            row += goingDown ? 1 : -1;
        }

        // Step 2: Fill the pattern row‑wise with cipher text
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < cipher.length(); j++) {
                if (pattern[i][j] == '*' && index < cipher.length()) {
                    pattern[i][j] = cipher.charAt(index++);
                }
            }
        }

        // Step 3: Read the message in zigzag order
        String decoded ="";
        row = 0;
        goingDown = false;

        for (int i = 0; i < cipher.length(); i++) {
            decoded+=(pattern[row][i]);

            if (row == 0 || row == r - 1) goingDown = !goingDown;
            row += goingDown ? 1 : -1;
        }

        System.out.println("Decrypted (rails=" + r + "): " + decoded);
        System.out.println("----------------------------------");
    }
}
    }