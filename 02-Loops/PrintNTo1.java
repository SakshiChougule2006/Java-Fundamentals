import java.util.Scanner;
public class PrintNTo1

{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of N:");

        int n=in.nextInt();

        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
        }

    }
}