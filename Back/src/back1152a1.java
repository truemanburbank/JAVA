import java.util.Scanner;

public class back1152a1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim(); //��,�� ��������
		
		scan.close();
		
		System.out.println(s.split(" ").length);
		// split���� " "�������� �ڸ�
		// �� ������ �ٷ� ���
	}
}
