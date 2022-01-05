import java.util.Scanner;

public class back10809a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[26]; //알파벳 개수만큼 배열 만듦
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = -1; //-1으로 배열 초기화
		}
		
		String s = scan.nextLine();
		scan.close();
		
		for(int i = 0 ; i <s.length(); i++) {
			char ch = s.charAt(i); // s의 문자 하나
			
			if(arr[ch-'a'] == -1) { // arr의 원소 값이 -1인 경우에만 초기화 (처음으로 나타난 인덱스를 저장해야 해서)
				arr[ch-'a'] = i; // 
			}
		}
		
		for(int val : arr) { // 배열의 다른 for문
			System.out.print(val + " "); 
		}
	}
}
