//배열과 치환을 이용하는 방법

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2941a1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String input = br.readLine().trim();
		int result = 0;
		
		int i;
		for(i = 0 ; i < word.length; i++) { // word의 길이만큼 돌면서
			if(input.contains(word[i])) { // word의 특정문자를 input이 가지고 있다면
				input = input.replaceAll(word[i], "*"); // 그 특정 문자를 모두 *으로 바꿈
			}
		}
		
		result = input.length(); // 따라서 답은 치환된 *을 포함한 input의 길이가 됨
		
		bw.write(result + "");
		bw.flush();
		
		br.close(); bw.close();
	}
}
