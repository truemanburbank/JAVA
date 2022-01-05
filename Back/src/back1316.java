// boolean 배열 만드는 법, 사용하는 법 *********
// 알파벳 배열을 만들어서 한번 나왔으면 true로 값이 바뀌게
// aaaba sdsd  >> 한번 나왔던 문자가 이어지지 않는 이상 나중에 중복으로 나오면 안 됨

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0 ; i < test_case ; i++) {
			String word = br.readLine().trim();
			
			if(Check(word) == true) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count) + "");
		bw.flush();
		
		br.close(); bw.close();
	}
	
	static boolean Check(String str) {
		boolean[] check = new boolean[26]; //해당하는 알파벳이 있는지, 있으면 true
		int prev = 0; 
		// 반복문에서 문자를 꺼내올때 앞선 문자와 연속되는지, 아닌지 판별
		
		for(int i = 0; i < str.length(); i++) { //문자수만큼 돈다
			int now = str.charAt(i); // i번째 문자 저장 (현재 문자)
			//int로 저장해서 숫자값으로 저장
			
			//앞선 문자와 i번째 문자가 같지 않다면?
			if(prev != now) {
				//해당 문자가 처음 나오는 경우
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			} // 연속적일 땐 그냥 건너뜀
		}
		return true;
	}
}
