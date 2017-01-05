import java.io.*;
class primepalindrome {
    public static void main(String args[]) throws IOException {
        int m, n, a, i, s, r = 0, j, k = 0, g = 0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter m,the first number");
        m = Integer.parseInt(in.readLine());
        System.out.println("Enter n,the second number");
        n = Integer.parseInt(in.readLine());
        if (m < n && m < 3000 && n < 3000) {
            for (i = m; i <= n; i++) {
                a = i;
                while (a > 0) {
                    s = a % 10;
                    r = (r * 10) + s;
                    a = a / 10;
                }
                if (r == i) {
                    for (j = 2; j < i; j++) {
                        if ((i % j) == 0) {
                            g = 1;
                        }
                    }
                    if (g == 0) {
                        System.out.print(i + ",");
                        k = k + 1;
                    }
                }
                r = 0;g=0;
            }
            System.out.println();
        } else
            System.out.println("Out of Range");
        System.out.println("Frequency of prime palindrome integers:" + k);
    }
}