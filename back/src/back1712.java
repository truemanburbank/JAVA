import java.util.Scanner;

public class back1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // ���� ���
		int b = scan.nextInt(); // ���� ���
		int c = scan.nextInt(); // ����
		int n = 0; // �Ǹŷ�
		
		if(c<=b) // a + n*b < n*c �� ���� �ʿ��ѵ� c�� b���� �۰ų� ������ ���� �����Ҽ� ���⿡
			n = -1;
		else n = a/(c-b) + 1;
		
		System.out.println(n);
		scan.close();
		//������� a
		//������� b
		//a + n*b = n*c �� ������ n = (c-b)/a�� ����� +1�� �� �ش� (���ͺб����� �Ѿ���ϴϱ�)
		//���� �б���
	}
}
