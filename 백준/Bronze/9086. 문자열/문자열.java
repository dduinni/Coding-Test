import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String input[] = new String[T];
		
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			input[i] = str.substring(0,1)+str.substring(str.length()-1, str.length());
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(input[i]);
		}
	}
}