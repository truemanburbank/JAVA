import java.util.Scanner;

public class back10809a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[26]; //���ĺ� ������ŭ �迭 ����
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = -1; //-1���� �迭 �ʱ�ȭ
		}
		
		String s = scan.nextLine();
		scan.close();
		
		for(int i = 0 ; i <s.length(); i++) {
			char ch = s.charAt(i); // s�� ���� �ϳ�
			
			if(arr[ch-'a'] == -1) { // arr�� ���� ���� -1�� ��쿡�� �ʱ�ȭ (ó������ ��Ÿ�� �ε����� �����ؾ� �ؼ�)
				arr[ch-'a'] = i; // 
			}
		}
		
		for(int val : arr) { // �迭�� �ٸ� for��
			System.out.print(val + " "); 
		}
	}
}
