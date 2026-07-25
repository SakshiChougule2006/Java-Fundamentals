import java.util.Scanner;
public class CountDigits

{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of N:");

        int n=in.nextInt();
        int count = 0;
       while(n!=0)
        {
            count=count+1;
            n=n/10;
        }
        System.out.println("count = " + count);
    }
}