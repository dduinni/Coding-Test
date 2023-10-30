import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String D = sc.next();
		
		Long result1 = Long.parseLong(A+B);
		Long result2 = Long.parseLong(C+D);
		System.out.println(result1+result2);
		
	}
}