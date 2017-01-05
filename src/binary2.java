import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class binary2 {
    public static void main(String args[]) throws IOException {
        int a, b, s, m, i, g, j, k, f, t = 0, y = 0, d, h;
        int n[][] = new int[100][100];
        int z[][] = new int[100][100];
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a number");
        a = Integer.parseInt(in.readLine());
        b = (int) Math.pow(2, a);
        s = b / 2;
        m = a - 1;
        for (i = 0; i < a; i++) {
            f = (int) Math.pow(2, m);
            for (g = 0; g < (int) Math.pow(2, t); g++) {
                for (j = 0; j < f; j++) {
                    n[i][y] = 0;
                    y++;
                }
                for (k = 0; k < f; k++) {
                    n[i][y] = 1;
                    y++;
                }
            }
            t++;
            y = 0;
            m--;
        }
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                z[j][i] = n[i][j];
            }
            System.out.println();
        }
    }
}
