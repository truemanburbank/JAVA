//BufferedRader, switch를 쓰는 법
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; // Buffered를 쓰려면 무조건
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2941a {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine().trim(); // 앞뒤 공백 제거
		int result = 0;
		int length = input.length();
		
		int i;
		for(i = 0; i<length; i++) {
			result++; // 일단 단어 개수 증가
			switch(input.charAt(i)) {
			case 'c':
				if(i + 1< length &&(input.charAt(i+1)=='=' || input.charAt(i+1)=='-')) {
					// 입력이 'ccc' 일 때, 마지막 c에서 예외가 발생하지 않도록 괄호를 잘 조정
					i++; //i가 input의 길이를 넘지 않게 조건을 제시하고, i+1값을 확인하여
					// i를 증가시켜 단어를 뛰어넘음
				}
				break;
			
			case 'd':
				if((i +2 < length) &&(input.charAt(i+1) == 'z') && (input.charAt(i+2)=='=')) {
					i = i +2; // 단어 3글자니까 2개 뛰어넘음
				}
				else if((i + 1 <length) && (input.charAt(i+1) == '-')) {
					i++;
				}
				break;
			
			case 'l': case 'n' : // 뒤 글자가 j로 같으니까 하나로 묶음
				if((i + 1 < length) && (input.charAt(i+1) == 'j')) {
					i++;
				}
				break;
				
			case 's': case 'z' :
				if((i + 1 < length)&& (input.charAt(i+1) == '=')) {
					i++;
				}
				break;
			}
		}
		
		bw.write(result + ""); // 버퍼에 추가
		bw.flush(); // 출력
		
		br.close(); bw.close();
	}
}
