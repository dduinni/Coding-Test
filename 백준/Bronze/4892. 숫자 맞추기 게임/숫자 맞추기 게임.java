import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=1; ; i++) {

            int n0 = sc.nextInt();
            int n1 = 3 * n0;
            int n2;
            if (n1 % 2 == 0) {
                n2 = n1 / 2;
            } else {
                n2 = (n1 + 1) / 2;
            }
            int n3 = 3 * n2;
            int n4 = n3 / 9;
            if (n1 % 2 == 0) {
                n0 = 2 * n4;
            } else {
                n0 = 2 * n4 + 1;
            }


            if (n0 == 0) {
                break;
            }
            if (n1 % 2 == 1) {
                System.out.println(i+"."+" odd " + n4);

            } else {
                System.out.println(i+ "."+" even " + n4);

            }
        }

    }
}