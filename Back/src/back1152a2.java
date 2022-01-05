import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//BufferedReader사용
public class back1152a2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BrfferedReader의 사용법
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.print(st.countTokens());
	}
}
