import java.util.Scanner;

public class back8958a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String arr[] = new String[scan.nextInt()]; // 변수를 따로 쓰지 않고 한번에 받을 수 있다
		
		for(int i =0 ; i <arr.length; i++) {
			arr[i] = scan.next(); // 처음에 입력한 수만큼 입력을 받는다.
		}
		
		scan.close();
		
		for(int i = 0; i < arr.length; i++) {
			
			int sum = 0; // 'O'카운트들의 합
			int cnt = 0; // 'O'카운트
			
			for(int j = 0; j < arr[i].length(); j++) // 배열 한줄에 있는 글자 하나하나
			{
				if(arr[i].charAt(j)=='O') { // 글자 하나하나를 찾기 위해 charAt을 사용
					cnt++; // 'O'면 cnt를 하나 증가
				}
				else { // 'X'면 cnt를 0으로 초기화
					cnt = 0;
				}
				
				sum += cnt;
			}
			System.out.println(sum);
		}
		
	}

}