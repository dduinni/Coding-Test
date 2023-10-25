import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
			int answer = sc.nextInt();
			if(answer == 1) {
				count++;
			}else {
				count--;
			}
		}
		if(count>0) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
		
	}
}