import java.util.Scanner;

public class back10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next(); // 입력받은 문자열
		int[] alpha = new int[26]; // 문자의 아스키 코드값을 받기 위한
		scan.close();
		
		for(int i = 0 ; i < alpha.length; i ++) {
			alpha[i] = -1; // 배열을 -1로 초기화
		}
		
		for(int i = 0; i < S.length(); i++) { //글자 수만큼 반복
			for(int j = 0 ; j < alpha.length; j++) { // 알파벳 26글자
				if(j == S.charAt(i)-97) {  //배열의 인덱스와 글자의 아스키코드가 같으면(97은 a의 아스키 코드 값을 0(배열 인덱스)으로 맞추기 위해 뺌)
					alpha[j] = S.indexOf(S.charAt(i)); // 해당하는 인덱스(0~26까지의 알파벳배열, a=0)의 배열에 문자열의 인덱스(=위치)를 넣는다.
				}                                      // charAt에서 찾은 문자의 인덱스를 indexOf로 검색할 때 첫번째로 나오는 문자의 인덱스를
			}                                          // 가져옴
		}
		
		for(int i = 0 ; i < alpha.length; i ++) {
			System.out.print(alpha[i]+" ");
		}
	}
}