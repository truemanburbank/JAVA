import java.util.Scanner;

public class back10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next(); // �Է¹��� ���ڿ�
		int[] alpha = new int[26]; // ������ �ƽ�Ű �ڵ尪�� �ޱ� ����
		scan.close();
		
		for(int i = 0 ; i < alpha.length; i ++) {
			alpha[i] = -1; // �迭�� -1�� �ʱ�ȭ
		}
		
		for(int i = 0; i < S.length(); i++) { //���� ����ŭ �ݺ�
			for(int j = 0 ; j < alpha.length; j++) { // ���ĺ� 26����
				if(j == S.charAt(i)-97) {  //�迭�� �ε����� ������ �ƽ�Ű�ڵ尡 ������(97�� a�� �ƽ�Ű �ڵ� ���� 0(�迭 �ε���)���� ���߱� ���� ��)
					alpha[j] = S.indexOf(S.charAt(i)); // �ش��ϴ� �ε���(0~26������ ���ĺ��迭, a=0)�� �迭�� ���ڿ��� �ε���(=��ġ)�� �ִ´�.
				}                                      // charAt���� ã�� ������ �ε����� indexOf�� �˻��� �� ù��°�� ������ ������ �ε�����
			}                                          // ������
		}
		
		for(int i = 0 ; i < alpha.length; i ++) {
			System.out.print(alpha[i]+" ");
		}
	}
}