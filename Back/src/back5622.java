import java.util.Scanner;

public class back5622 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] num = new String[]{"1111", "1ABC", "1DEF", "1GHI", "1JKL", "1MNO", "PQRS", "1TUV", "WXYZ", "1111"};
		// ���̾�(�ε���)�� ���ĺ�(��)�� �̾ �迭�� �����, ���� ���̸� 4�� ���߱� ���ؼ� ����ִ� ĭ�� ��������(1)�� ����
		String str = scan.next();
		scan.close();
		int time = 0; // ��ȭ�ɶ� �ɸ��� �ð�
		
		for(int i = 0; i < str.length(); i ++) { // �ҸӴϰ� �ܿ� �ܾ� ���̸�ŭ
			for(int j = 0 ; j < num.length; j++) { // ���ĺ� �迭 ���̸�ŭ
				for(int k = 0; k <4; k++) { // �迭 ���� ���̸�ŭ ���Ƽ�
					if(str.charAt(i) == num[j].charAt(k)) { 
						// charAt���� �ҸӴϰ� �ܿ� �ܾ��� ���ڿ� �迭�� ����ִ� ���ڸ� ������ ���Ѵ�
						time += j+2;
					}
				}
			}
		}
		System.out.print(time);
	}
}
