import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] input = new int[N];
		int count=0;
		
		for(int i=0; i<N; i++) {
			input[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		
		for(int i =0; i<input.length; i++) {
			if(v==input[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}