import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int count = 0;

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        }

        in.close();
    }
}