import java.util.Scanner;

class Print1ToN

{

    public static void main(String args[])

    {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of N:");

        int n=in.nextInt();

        for(int i=1;i<=n;i++)

        {

            System.out.println(i);

        }

    }

}