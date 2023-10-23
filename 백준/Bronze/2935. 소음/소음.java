import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		String op = sc.next();
		BigInteger B = sc.nextBigInteger();
		if(op.equals("*")) {
			System.out.println(A.multiply(B));
		}else {
			System.out.println(A.add(B));
		}
	}
}