
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer N (0 to 12): ");
        int N = input.nextInt();

        if (N < 0 || N > 12) {
            System.out.println("Invalid input. Enter a number from 0 to 12.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= N; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial: " + factorial);
        }

        input.close();
    }
}
