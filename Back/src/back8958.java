
import java.util.Scanner;
import java.util.StringTokenizer;

public class back8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� ��
		int a = scan.nextInt();

		//������ ���� �迭
		String[] answer = new String[a];
		int[] score = new int[a];
		int size = answer.length;
		int sum = 0;
		
		//���� �Է�
		for(int i = 0; i < size ; i++) {
			answer[i] = scan.next();
		}
		
		//��ū ����, X�� ������� ����
		for(int i = 0; i <size ; i++) {
		StringTokenizer st = new StringTokenizer(answer[i], "X");
		
		//o�� �Ľ�
		while(st.hasMoreTokens()) { //���� ��ū�� �ִٸ�
			answer[i] = st.nextToken(); //�迭�� �� ��ū�� ���
			
			//o���� ���ϱ�
			for(int j = 1; j <= answer[i].length() ; j++) {
				sum += j;
				}
			
			// ���� �迭�� ������ ���� ����
			score[i] = sum;
			}
		
		System.out.println(score[i]);
		sum = 0; // �ʱ�ȭ
		}
		scan.close();
	}
}
