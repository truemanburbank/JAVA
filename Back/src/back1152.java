import java.util.Scanner;

// ***** 공백만 입력했을 때 1이 나오는 경우 예외처리********
public class back1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().trim(); // 공백 포함 문자 입력받음, trim()을 사용해 문자열 맨앞, 맨뒤 공백 제거
		int sum = 0;
		scan.close();
		
		if(str.length() == 0) { //문자열이 공백일때
			sum = 0;
		}
		else {
			sum = 1;
			for(int i = 0 ; i < str.length(); i++) {
				if(Character.isWhitespace(str.charAt(i))) { // Character의 메소드를 이용해서 whitespace인지 확인함
					sum++; //for문이 돌기 시작했으면 문자열이 공백이 아니고, 공백수로 단어 수를 구하는 것이기 때문에 sum=1부터 시작                 
				}
			}
		}
		
		System.out.println(sum);
	}
}
