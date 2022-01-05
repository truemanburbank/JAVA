import java.util.Scanner;

public class back1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(Hansu(scan.nextInt()));
		scan.close();
	}
	
	//�Ѽ��� ���Ǹ� Ȯ���� ����
	//1~99������ ������ �Ѽ� (���� ����� �����Ƿ�)
	//���� ������ Ȯ���Ѵ�. 1000 �̸�. �ٵ� �Է� ������ 1000�� �����Ƿ� ����ó���� �Ѵ�.
	
	public static int Hansu(int n) {
		int[] x = new int[4]; // �� �ڸ����� ������ �迭
		int sum = 0; //�Ѽ� ������ ������ ����
		
		if(n<100) {
			sum = n; // 100�̸��� ���� �� �Ѽ��̴�.
		}
		
		if(n>=100) {
			if(n >= 1000) // ����ó��
				n = 999; //1000 �̸��̹Ƿ� 999�� ��ģ��
			sum = 99;
		for(int i = 100; i <= n; i++) {  // ���� n�� ���� Ȯ���Ѵ�
			int num = i;
			int j = 3;

			while(num!=0) {// �� �ڸ����� �迭�� ����
				x[j] = num%10;
				j--;
				num /= 10;
			}
			if(((x[1]-x[2])) == x[2]-x[3]) { // ���ڸ����� �˻��ϸ� �ǹǷ� ���������� Ư¡�� ���
				sum +=1;
			}
		}
	}
		return sum;
}
}