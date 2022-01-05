import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class back2675a {                   //bufferedreader는 예외처리를 꼭 해줘야 한다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner와 유사
		
		int T = Integer.parseInt(br.readLine());
		//testcase 입력받음
		//bufferedreader는 입력받을 때 readLine을 쓰는데 무조건 String으로
		//반환돼서 형변환을 해줘야 한다.
		
		for(int i = 0; i <T; i++) {
			String[] str = br.readLine().split(" "); //공백 분리
			//.split(" ") >>>> 공백마다 데이터 끊어서 배열에 넣음
			// 예제 입력 3 ABC
			
			int R = Integer.parseInt(str[0]); // String -> int, 반복할 횟수, 3 저장
			String S = str[1]; // 반복할 문자열, ABC 저장
			
			for(int j = 0; j < S.length(); j++) {  //문자열의 길이만큼
				for(int k = 0; k < R; k++) { // 반복할 횟수
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
