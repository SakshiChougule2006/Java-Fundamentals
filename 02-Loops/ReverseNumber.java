import java.util.Scanner;
public class ReverseNumber

{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of N:");

        int n=in.nextInt();
        int digit=0; 
        int rev=0;
        while(n!=0)
        {
           digit=n%10;
        rev=rev*10+digit;
        n=n/10;
         
        }
        System.out.println("rev = " + rev);
    }
}