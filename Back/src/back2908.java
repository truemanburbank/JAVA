import java.util.Scanner;

//StringBuffer, ���׿����� ���
public class back2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();
		scan.close();
		
		StringBuffer sb1 = new StringBuffer(num1); // StringBuffer�� ����� ���ڿ� ������
		String new_num1 = sb1.reverse().toString();// ���� �˾Ƶα�
		
		StringBuffer sb2 = new StringBuffer(num2);
		String new_num2 = sb2.reverse().toString();
		
		int n1 = Integer.parseInt(new_num1);
		int n2 = Integer.parseInt(new_num2);
		
		System.out.print(n1 > n2 ? n1 : n2); // ���׿�����
	}
}
