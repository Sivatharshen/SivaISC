import java.io.*;
class ConsChange
{
    int len;
    String c[]=new String[100];
    String word,word2,g,f,u;
    void ConsChange(String a,int b)
    {
        word=a;
        len=b;
        g="";
        f="";
    }
    void readword(String a)
    {
        g=a.toLowerCase();
    }
    void shiftcons()
    {
        int i,l;String t=g;
        l=t.length();
        for(i=0;i<l;i++) {
            char ch = t.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                c[i]="";
                c[i] =c[i]+ ch;
                continue;
            } else {
                f = f + ch;
                c[i]="";
            }
        }
        word2=f;
        for(i=0;i<l;i++)
        {
            f=f+c[i];
        }
    }
    void changeword()
    {
        u=word2.toUpperCase();
        int i;
        for(i=0;i<len;i++)
        {
            u=u+c[i];
        }
    }
    void show()
    {
System.out.println("Orginal word "+word);
        System.out.println("Shifted word "+f);
                System.out.println("Changed word "+u);
    }
    public static void main(String Args[])throws IOException
    {
        String s;
        int k;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence");
        s=in.readLine();
        k=s.length();
        ConsChange ob=new ConsChange();
        ob.ConsChange(s,k);
        ob.readword(s);
        ob.shiftcons();
        ob.changeword();
        ob.show();
    }
}

