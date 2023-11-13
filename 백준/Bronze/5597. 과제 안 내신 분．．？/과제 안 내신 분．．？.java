import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[31];
		
		for(int i=1; i<=28; i++) {
			int student = sc.nextInt();
			num[student] = 1;
		}
		
		for(int i=1; i<num.length; i++) {
			if(num[i]!=1) {
				System.out.println(i);
			}
		}
	}
}