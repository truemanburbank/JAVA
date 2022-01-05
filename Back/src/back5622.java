import java.util.Scanner;

public class back5622 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] num = new String[]{"1111", "1ABC", "1DEF", "1GHI", "1JKL", "1MNO", "PQRS", "1TUV", "WXYZ", "1111"};
		// 다이얼(인덱스)과 알파벳(값)을 이어서 배열로 만들고, 값의 길이를 4로 맞추기 위해서 비어있는 칸엔 무작위값(1)을 넣음
		String str = scan.next();
		scan.close();
		int time = 0; // 전화걸때 걸리는 시간
		
		for(int i = 0; i < str.length(); i ++) { // 할머니가 외운 단어 길이만큼
			for(int j = 0 ; j < num.length; j++) { // 알파벳 배열 길이만큼
				for(int k = 0; k <4; k++) { // 배열 값의 길이만큼 돌아서
					if(str.charAt(i) == num[j].charAt(k)) { 
						// charAt으로 할머니가 외운 단어의 문자와 배열에 들어있는 문자를 일일이 비교한다
						time += j+2;
					}
				}
			}
		}
		System.out.print(time);
	}
}
