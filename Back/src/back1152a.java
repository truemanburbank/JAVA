// 토큰을 사용해서 푸는 법

import java.util.Scanner;
import java.util.StringTokenizer;

public class back1152a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		scan.close();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		// 공백을 기준으로 나눈 토큰들을 st에 저장한다
		
		System.out.println(st.countTokens());
		//countTokens()는 토큰의 개수를 반환한다.
	}
	
}
