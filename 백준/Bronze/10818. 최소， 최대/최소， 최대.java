import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int max = -1000000;
		int min = 1000000;
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
			}
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.print(min + " " + max);
	}
}