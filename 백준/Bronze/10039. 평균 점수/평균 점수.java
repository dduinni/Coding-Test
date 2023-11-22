import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		if(num1<40) {
			num1 = 40;
		}
		if(num2<40) {
			num2 = 40;
		}
		if(num3<40) {
			num3 = 40;
		}
		if(num4<40) {
			num4 = 40;
		}
		if(num5<40) {
			num5 = 40;
		}
		int score = num1+num2+num3+num4+num5;
		int avg = score/5;
		System.out.println(avg);
	}
}