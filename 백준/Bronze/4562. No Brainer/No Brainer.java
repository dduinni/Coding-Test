import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if(X>=Y) {
				System.out.println("MMM BRAINS");
			}else {
				System.out.println("NO BRAINS");
			}
		}
	}
}