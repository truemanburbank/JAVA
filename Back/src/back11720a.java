import java.util.Scanner;

public class back11720a {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // ������ ����
		String a = scan.next(); // ����
		scan.close();
		
		int sum = 0; // ���ڵ��� ��
		
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i) - '0'; // ���ڿ��� �ִ� ���ڸ� �ϳ��� ���Ѵ�
		}                             // char to int = -'0' �� ��� ��
		
		System.out.print(sum);
	}
}
