import java.util.Scanner;
public class EvenNumber

{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of N:");

        int n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
            System.out.println(i);
            }
        }

    }
}