
import java.util.Scanner;
import java.util.StringTokenizer;

public class back8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제 수
		int a = scan.nextInt();

		//문제를 담을 배열
		String[] answer = new String[a];
		int[] score = new int[a];
		int size = answer.length;
		int sum = 0;
		
		//문제 입력
		for(int i = 0; i < size ; i++) {
			answer[i] = scan.next();
		}
		
		//토큰 생성, X로 문장들을 나눔
		for(int i = 0; i <size ; i++) {
		StringTokenizer st = new StringTokenizer(answer[i], "X");
		
		//o만 파싱
		while(st.hasMoreTokens()) { //다음 토큰이 있다면
			answer[i] = st.nextToken(); //배열에 한 토큰씩 담기
			
			//o들을 더하기
			for(int j = 1; j <= answer[i].length() ; j++) {
				sum += j;
				}
			
			// 점수 배열에 점수의 합을 넣은
			score[i] = sum;
			}
		
		System.out.println(score[i]);
		sum = 0; // 초기화
		}
		scan.close();
	}
}
