import java.util.Scanner;

public class back1065a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(Hansu(scan.nextInt()));
		scan.close();
	}
	
	public static int Hansu(int n) {
		int cnt = 0; //한수 개수 카운팅
		
		if(n < 100) { // 100미만일 때 한수의 수는 자기자신이다.
			return n;
		}
		else { //n이 100이상일 때
			cnt = 99; // 99를 깔고 시작, 100이상일 경우부터 확인
			if(n >= 1000) { // 입력에 예외가 있으므로 예외처리를 한다
				n = 999;
			}
			
			for(int i = 100; i <=n; i++) { //100~999까지
				int hun = i / 100; //백의 자릿수
				int ten = (i/10)%10; //십의 자리수
				int one = i % 10; // 일의 자리수
				
				if((hun - ten) == (ten - one)) {// 각자리수의 차가 같으면
					cnt++;
				}
			}
		}
		return cnt;
	}
}

