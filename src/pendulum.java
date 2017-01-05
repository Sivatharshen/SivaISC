import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pendulum
{
    public static void main(String args[])throws IOException
    {
        int a[]=new int[100];
        int n,i,j,g,v=0;
        int b[]=new int[100];
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number of numbers in array");
        n=Integer.parseInt(in.readLine());
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            a[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<(n-1);i++)
        {
            for(j=(i+1);j<n;j++)
            {
                if(a[i]>a[j])
                {
                    g=a[i];
                    a[i]=a[j];
                    a[j]=g;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
        for(i=(n-1);i>=0;i=i-2)
        {
            b[v]=a[i];
            v++;
        }
        if(n%2!=0)
        {
            for(i=1;i<n;i=i+2)
            {
                b[v]=a[i];
                v++;
            }
        }
        else
        {
            for(i=0;i<n;i=i+2)
            {
                b[v]=a[i];
                v++;
            }
        }
        for(i=0;i<v;i++)
        {
            System.out.print(b[i]+"  ");
        }
    }
}