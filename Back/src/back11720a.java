import java.util.Scanner;

public class back11720a {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // 숫자의 개수
		String a = scan.next(); // 숫자
		scan.close();
		
		int sum = 0; // 숫자들의 합
		
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i) - '0'; // 문자열에 있는 숫자를 하나씩 더한다
		}                             // char to int = -'0' 해 줘야 함
		
		System.out.print(sum);
	}
}
