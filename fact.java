import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long f = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println("Factorial of " + n + " is " + f);
        }

        sc.close();
    }
}
