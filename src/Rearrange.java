import java.io.*;
class Rearrange {
    int len;
    String Txt, Cxt, Sxt;

    void Rearrange(String a) {
        Txt = a;
        len = a.length();
    }

    void readword() {
        Sxt = Txt.toUpperCase();
    }

    void convert() {
        int i, p = 1, j, k;
        for (i = 1; i < len; i++) {
            char c = Sxt.charAt(i);
            char ch = Sxt.charAt(0);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                Cxt = Cxt + "Y";
                p = 0;
                System.out.println("orginal word=" + Txt + "changed word=" + Cxt);
                break;
            } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                Cxt = "";
                p = 0;
                for (j = i; j < len; j++) {
                    char d = Sxt.charAt(j);
                    Cxt = Cxt + d;
                }
                for (k = 0; k < i; k++) {
                    char d = Sxt.charAt(k);
                    Cxt = Cxt + d;
                }
                Cxt = Cxt + "C";
                System.out.print("Orginal word" + Sxt + "\nChanged word" + Cxt);
                break;
            } else {
                continue;
            }
        }
        if (p == 1) {
            System.out.println("Orginal word" + Sxt + "\nChanged word" + Sxt + "N");
            Cxt = Sxt + "N";
        }
    }

    void display() {
        System.out.println("Orginal word" + Sxt + "\nChanged word" + Cxt);
    }

    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a word");
        String Txt = in.readLine();
        Rearrange ob = new Rearrange();
        ob.Rearrange(Txt);
        ob.readword();
        ob.convert();
        ob.display();
    }
}