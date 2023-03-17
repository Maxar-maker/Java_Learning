import java.util.*;
public class MagicSquareGen
{
    public static int[][] generateSquare(int n) {
        // initialize magic square
        int[][] mat = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n;) {
            // if row is -1 and column becomes n,
            // set row = 0, col = n -2
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                // If next number goes to out of
                // square's right side
                if (j == n)
                    j = 0;

                // If next number goes to out of
                // square's upper side
                if (i < 0)
                    i = n - 1;
            }

            // If number is already present decrement
            // column by 2, and increment row by 1
            if (mat[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                // set number
                mat[i][j] = num++;
            }

            // increment and decrement
            // column and row by 1 respectively
            j++;
            i--;
        }

        return mat;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] magicSquare = generateSquare(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[j][i] + " ");
            }
            System.out.println();
        }
    }
    }
