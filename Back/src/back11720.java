import java.util.Scanner;
public class back11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n; // ���ڿ��� ������ ���ڿ�
		int sum = 0; // ������ ���� ������ ����
		int[] num = new int[scan.nextInt()];// �Է��� ����ŭ ���� �迭�� ����
		
		n = scan.next(); // ���ڿ��� �Է¹޴´�
		
		scan.close();
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = n.charAt(i) - '0'; // char���� int�� ���ڸ� �ѱ� ��
			sum += num[i];              // - '0'�� �� ��� �Ѵ�.
		}                               // (�ƽ�Ű�ڵ尪�� �ѱ�� ������)
		
		System.out.println(sum);
	}
}
