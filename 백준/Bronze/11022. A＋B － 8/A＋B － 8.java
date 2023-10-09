import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = A+B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = "  +sum);
        }
    }
}