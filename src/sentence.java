import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sentence
{
    public static void main(String args[])throws IOException
    {
        int b,c=0,i,g,j,r=0,z=0;
        String e="",a;
        String d[]=new String[100];
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence");
        a=in.readLine();
        b=a.length();
        for(i=0;i<b;i++)
        {
            char ch=a.charAt(i);
            if((ch=='.')||(ch=='?')||ch==(' '))/*to seperate the words*/
            {
                d[c] = e;
                c = c + 1;
                e = "";
            }
            else if(ch==','||ch=='/'||ch=='!'||ch=='&')/*to print error message if the sentence does not terminate with ' ' or '.' or '?'*/
                System.out.print("Wrong Input");
            else
            {
                e=e+ch;
            }
        }
        System.out.print("Word"+"\t"+"Vowels"+"\t"+"consonants");
        System.out.println();
        for(i=0;i<c;i++) {
            g = d[i].length();
            char m = Character.toUpperCase(d[i].charAt(0));/*to convert the first letter of the word to upper case*/
            System.out.print(m);
            if ((m == 'a' || m == 'A' || m == 'e' || m == 'E' || m == 'i' || m == 'I' || m == 'o' || m == 'O' || m == 'u' || m == 'U')) {/*to count the vowels*/
                r = r + 1;
            } else/*to count the consonants*/
            {
             z=z+1;
            }
            for(j=1;j<g;j++)
            {
                char p=d[i].charAt(j);
                System.out.print(p);
                if ((p == 'a' || p == 'A' ||  p== 'e' || p == 'E' || p == 'i' || p == 'I' || p == 'o' || p == 'O' || p == 'u' || p == 'U'))
                {
                    r=r+1;/*to count the consonants*/
                }
                else
                {
                    z=z+1;
                }
            }
            System.out.print("\t\t"+r);
            System.out.print("\t\t"+z);
            System.out.println();
            r=0;z=0;
        }
        }
    }