import java.util.Scanner;

//StringBuffer, 삼항연산자 사용
public class back2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();
		scan.close();
		
		StringBuffer sb1 = new StringBuffer(num1); // StringBuffer를 사용해 문자열 뒤집기
		String new_num1 = sb1.reverse().toString();// 사용법 알아두기
		
		StringBuffer sb2 = new StringBuffer(num2);
		String new_num2 = sb2.reverse().toString();
		
		int n1 = Integer.parseInt(new_num1);
		int n2 = Integer.parseInt(new_num2);
		
		System.out.print(n1 > n2 ? n1 : n2); // 삼항연산자
	}
}
