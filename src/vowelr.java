import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class vowelr
{
    public static void main(String args[])throws IOException
    {
        int b,s,d=0,i=0,j;char c;
        char ch2[]=new char[100];
        String a;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the word");
        a=in.readLine();
        b=a.length();
        s=b-1;
        for(j=0;j<b;j++)
        {
            ch2[j] = a.charAt(j);
        }
            for(i=0;i<b;i++) {
                    char ch = a.charAt(i);
                    for (j = s; j >i ; j--) {
                        char ch1 = a.charAt(j);
                        if ((ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') && (ch1 == 'a' || ch1 == 'A' || ch1 == 'e' || ch1 == 'E' || ch1 == 'i' || ch1 == 'I' || ch1 == 'o' || ch1 == 'O' || ch1 == 'u' || ch1 == 'U')) {
                            ch2[i] = ch1;
                            ch2[s] = ch;

                            continue;
                        }
                }
            }
        for(j=0;j<b;j++)
        {
            System.out.print(ch2[j]);
        }
    }
}