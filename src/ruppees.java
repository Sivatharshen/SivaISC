
import java.io.*;
class ruppees
{
    public static void main(String args[])throws IOException
    {
        int s[]={100000,1000,100,90,80,70,60,50,40,30,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        String a[]={"lakh","thousand","hundred","ninety","eighty","seventy","sixty","fifty","forty","thirty","twenty","nineteen","eighteen","seventeen","sixteen","fifteen","fourteen","thirteen","twelve","eleven","ten","nine","eight","seven","six","five","four","three","two","one"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number");
        int b=Integer.parseInt(in.readLine());
        int n=0,i=0,j,u=0,g=0;
        while(b>0)
        {
            while(b>=s[i])
            {
                b=b-s[i];
                n++;
            }
            g=n;
            if(i<3)
            {
                while(g>0)
                {
                    if(g>=s[u])
                    {
                        g=g-s[u];
                        System.out.print(a[u]+" ");
                    }
                    else
                        u++;
                }
            }
            u=0;
            if(n>0)
                System.out.print(a[i]+" ");
            else
                i++;
            n=0;
        }
    }
}