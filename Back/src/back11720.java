import java.util.Scanner;
public class back11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n; // 숫자열을 저장할 문자열
		int sum = 0; // 수들의 합을 저장할 변수
		int[] num = new int[scan.nextInt()];// 입력한 수만큼 정수 배열을 생성
		
		n = scan.next(); // 숫자열을 입력받는다
		
		scan.close();
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = n.charAt(i) - '0'; // char에서 int로 숫자를 넘길 때
			sum += num[i];              // - '0'을 해 줘야 한다.
		}                               // (아스키코드값을 넘기기 때문에)
		
		System.out.println(sum);
	}
}
