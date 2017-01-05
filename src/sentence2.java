import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class sentence2 {
    public static void main(String args[]) throws IOException {
        int b, c = 0, i, l, n = 1,u=0,j;
        String e = "", a, s;
        String d[] = new String[100];
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a sentence");
        a = in.readLine();
        b = a.length();
        for (i = 0; i < b; i++)
        {
            char ch = a.charAt(i);
            if ((ch == '.') || ch == (' '))
            {
                d[c] = e;
                c = c + 1;
                e = "";
            } else {
                e = e + ch;
            }
        }
        System.out.println("Enter a word");
        s = in.readLine();
        l = s.length();
        while (n>0) {
            n=0;
                        for (i = 0; i < l; i++) {
                            char ch = s.charAt(i);
                            for (j = 0; j < c; j++) {
                                char ch1 = d[j].charAt(0);
                                if (ch == ch1) {
                                    System.out.print(d[j]+" ");
                                    d[j] = " ";
                                    n=n+1;
                                    u=u+1;
                                    break;
                                }
                            }
                        if(u==0)
                        {
                            System.out.print("* ");
                        }u=0;
                        }
            if(n==0)
                break;
            System.out.println();
        }
    }
}