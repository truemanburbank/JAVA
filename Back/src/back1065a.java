import java.util.Scanner;

public class back1065a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(Hansu(scan.nextInt()));
		scan.close();
	}
	
	public static int Hansu(int n) {
		int cnt = 0; //�Ѽ� ���� ī����
		
		if(n < 100) { // 100�̸��� �� �Ѽ��� ���� �ڱ��ڽ��̴�.
			return n;
		}
		else { //n�� 100�̻��� ��
			cnt = 99; // 99�� ��� ����, 100�̻��� ������ Ȯ��
			if(n >= 1000) { // �Է¿� ���ܰ� �����Ƿ� ����ó���� �Ѵ�
				n = 999;
			}
			
			for(int i = 100; i <=n; i++) { //100~999����
				int hun = i / 100; //���� �ڸ���
				int ten = (i/10)%10; //���� �ڸ���
				int one = i % 10; // ���� �ڸ���
				
				if((hun - ten) == (ten - one)) {// ���ڸ����� ���� ������
					cnt++;
				}
			}
		}
		return cnt;
	}
}

