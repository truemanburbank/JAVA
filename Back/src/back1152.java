import java.util.Scanner;

// ***** ���鸸 �Է����� �� 1�� ������ ��� ����ó��********
public class back1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().trim(); // ���� ���� ���� �Է¹���, trim()�� ����� ���ڿ� �Ǿ�, �ǵ� ���� ����
		int sum = 0;
		scan.close();
		
		if(str.length() == 0) { //���ڿ��� �����϶�
			sum = 0;
		}
		else {
			sum = 1;
			for(int i = 0 ; i < str.length(); i++) {
				if(Character.isWhitespace(str.charAt(i))) { // Character�� �޼ҵ带 �̿��ؼ� whitespace���� Ȯ����
					sum++; //for���� ���� ���������� ���ڿ��� ������ �ƴϰ�, ������� �ܾ� ���� ���ϴ� ���̱� ������ sum=1���� ����                 
				}
			}
		}
		
		System.out.println(sum);
	}
}
