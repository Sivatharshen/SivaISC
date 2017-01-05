import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class reverse
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
        for(i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}