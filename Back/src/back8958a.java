import java.util.Scanner;

public class back8958a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String arr[] = new String[scan.nextInt()]; // ������ ���� ���� �ʰ� �ѹ��� ���� �� �ִ�
		
		for(int i =0 ; i <arr.length; i++) {
			arr[i] = scan.next(); // ó���� �Է��� ����ŭ �Է��� �޴´�.
		}
		
		scan.close();
		
		for(int i = 0; i < arr.length; i++) {
			
			int sum = 0; // 'O'ī��Ʈ���� ��
			int cnt = 0; // 'O'ī��Ʈ
			
			for(int j = 0; j < arr[i].length(); j++) // �迭 ���ٿ� �ִ� ���� �ϳ��ϳ�
			{
				if(arr[i].charAt(j)=='O') { // ���� �ϳ��ϳ��� ã�� ���� charAt�� ���
					cnt++; // 'O'�� cnt�� �ϳ� ����
				}
				else { // 'X'�� cnt�� 0���� �ʱ�ȭ
					cnt = 0;
				}
				
				sum += cnt;
			}
			System.out.println(sum);
		}
		
	}

}