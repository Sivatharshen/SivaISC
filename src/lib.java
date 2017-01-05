import java.io.*;
import java.util.Scanner;

class lib
{
    public static void main(String args[])throws IOException
    {
        int f,e,i,g=1,n,c,j;String rollno,name1,name2,cl;
        String a[]=new String[100];int an[][]=new int[100][100];int rollnos[]=new int[100];
        int nb;
        FileReader fin=new FileReader("lib.txt");
        BufferedReader in=new BufferedReader(fin);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter 1 to display records , 2 to add records,3 to find the student having the book");
        c=sc1.nextInt();
        switch(c)
        {
            case 1:
            {
                System.out.println("Roll No.     First Name      lastname  class  no. of books   acsension no.");
                Scanner s1=new Scanner(new File("lib.txt"));
                while(s1.hasNext())
                {
                    rollno=s1.next();
                    name1=s1.next();
                    name2=s1.next();
                    cl=s1.next();
                    nb=s1.nextInt();
                    System.out.print(rollno+"\t\t"+name1+"\t\t"+name2+"\t"+cl+"\t"+nb+"\t\t");
                    for(i=0;i<nb;i++)
                    {
                        an[g][i]=s1.nextInt();
                        System.out.print(an[g][i]+" ");
                    }
                    g++;
                    System.out.println();
                }
                s1.close();
                break;
            }
            case 2:
            {
                FileWriter fr1=new FileWriter("lib.txt",true);
                BufferedWriter br1=new BufferedWriter(fr1);
                PrintWriter pr1=new PrintWriter(br1);
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number of records to be entered");
                int m=sc.nextInt();
                for(i=1;i<=m;i++)
                {
                    System.out.println("Enter the roll no.");
                    rollno=sc.next();
                    System.out.println("Enter the first name");
                    name1=sc.next();
                    System.out.println("Enter the second name");
                    name2=sc.next();
                    System.out.println("Enter the class");
                    cl=sc.next();
                    System.out.println("Enter the number of books taken");
                    nb=sc.nextInt();
                    for(j=0;j<nb;j++)
                    {
                        an[g][j]=sc.nextInt();
                    }
                    pr1.println(rollno);
                    pr1.println(name1);
                    pr1.println(name2);
                    pr1.println(cl);
                    pr1.println(nb);
                    for(j=0;j<nb;j++)
                    {
                        pr1.println(an[g][j]);
                    }
                }
                pr1.close();
                br1.close();
                fr1.close();
                break;
            }
            case 3:
            {
                String aname1[]=new String[100];
                String aname2[]=new String[100];
                String acl[]=new String[100];
                Scanner s1=new Scanner(new File("lib.txt"));
                while(s1.hasNext())
                {
                    rollnos[g]=s1.nextInt();
                    aname1[g]=s1.next();
                    aname2[g]=s1.next();
                    acl[g]=s1.next();
                    nb=s1.nextInt();
                    for(i=0;i<nb;i++)
                    {
                        an[g][i]=s1.nextInt();
                    }
                    g++;
                }
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter the number written on the book");
                int s=sc2.nextInt();
                for(i=0;i<g;i++)
                {
                    for(j=0;j<g;j++)
                    {
                        if(s==an[i][j])
                        {
                            System.out.print(rollnos[i]+"\t"+aname1[i]+"\t"+aname2[i]);
                        }
                    }
                }
                s1.close();
                break;
            }
            default:
            {
                System.out.println("Wrong Choice");
            }
        }
    }
}