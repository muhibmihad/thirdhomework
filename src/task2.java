
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = input.nextInt();

        int count = 0;

        System.out.println("Even numbers:");

        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println();
        System.out.println("Count: " + count);

        input.close();
    }
}
