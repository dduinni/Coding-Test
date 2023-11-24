import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int D = gcd(A,B);
			
			sb.append(A*B/D).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int gcd(int A, int B) {
		
		while(B!=0) {
			int r = A % B;
			
			A = B;
			B = r;
		}
		return A;
	}
}	