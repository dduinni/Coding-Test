import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long count = (A==B)? 0 : ((B>A) ? B - A - 1 : A - B - 1);
        System.out.println(count);

        if(B > A) {
            for (long i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (long i = B + 1; i < A; i++) {
                System.out.print(i + " ");
            }
        }
    }
}