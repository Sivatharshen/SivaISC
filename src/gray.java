import java.util.Scanner;

class gray
{
    public static void main(String args[])
    {
        int n,b,i,j,h;
        String st="";
        int a[]={0,1,3,2,6,4,5,7,15,14,12,13,9,11,10,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a code");
        n=sc.nextInt();
        b=(int)(Math.pow(2,n));
        String s[]=new String[b];
        for(i=0;i<b;i++)
        {
            j=i;
            while(st.length()!=n-1)
            {
                h=j%2;
                st=Integer.toString(h)+st;
                j=j/2;
            }
            s[i]=Integer.toString(j)+st;
            st="";
        }
        for(i=0;i<b;i++)
        {
            System.out.println(s[a[i]]);
        }
    }
}