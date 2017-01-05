import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class para
{
    public static void main(String args[])throws IOException
    {
        int b,c=0,i,l,k=0,j;
        String e="",a;
        String d[]=new String[100];
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a paragraph");
        a=in.readLine();
        b=a.length();
        for(i=0;i<b;i++)
        {
            char ch=a.charAt(i);
            if((ch=='.')||(ch=='?')||(ch=='!'))
            {
                d[c]=e;
                c=c+1;
                e="";
            }
            else
            {
                e=e+ch;
            }
        }
        System.out.println("The number of sentences are "+c);
        for(i=0;i<c;i++)
        {
            l=d[i].length();
            for(j=0;j<l;j++)
            {
                char ch=d[i].charAt(j);
                if(ch==' ')
                {
                    k=k+1;
                }
            }
            k=k+1;
            System.out.println("The number of words in sentence "+(i+1)+"is "+k);
            k=0;
        }
    }
}