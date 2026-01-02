import java.util.*;
public class Driver_Rail
{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        RailFenceCipher ob = new RailFenceCipher();

        ob.explain();


         // Consume the newline character
        boolean t=true;
        while(t)
        {
            System.out.println("Do you want to encrypt or decrypt?");
        System.out.println("1) Encrypt\n2) Decrypt\n3)Exit Program");
        int choice = sc.nextInt();
        sc.nextLine();
            switch (choice) {
            case 1:
                System.out.println("Enter the text to encrypt:");
                ob.str = sc.nextLine();
                System.out.println("Enter the number of rails (rows)(less than 10):");
                ob.rows = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                ob.encrypt();
                break;

            case 2:
                System.out.println("Enter the encrypted text to decrypt:");
                ob.str = sc.nextLine();
                 ob.decrypt();
                break;
            case 3:
                t=false;
                break;
            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }
        }
        
    }
}
