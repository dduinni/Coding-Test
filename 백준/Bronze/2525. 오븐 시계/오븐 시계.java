import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	// 시
		int B = sc.nextInt();	// 분
		int C = sc.nextInt();	// 요리하는데 필요한 시간
		
		int min = 60*A + B;
		min += C;
		
		int hour = (min/60)%24;
		int minute = min%60;
		
		System.out.println(hour + " " + minute);
	}
}