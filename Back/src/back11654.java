import java.util.Scanner;

public class back11654 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Scanner�� "����"�� �������� nextLine()�̳� next()�� ��� ��
		//���� �� "���ڿ�"�� "charAt(0)"���� "����"�� �߶��־�� ��
		
		int ch = scan.next().charAt(0);
		// ���� ���ڸ� int���� ������ �ƽ�Ű �ڵ尪���� �����ȴ�.
		
		System.out.println(ch);
		scan.close();
	}
}
