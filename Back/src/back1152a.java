// ��ū�� ����ؼ� Ǫ�� ��

import java.util.Scanner;
import java.util.StringTokenizer;

public class back1152a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		scan.close();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		// ������ �������� ���� ��ū���� st�� �����Ѵ�
		
		System.out.println(st.countTokens());
		//countTokens()�� ��ū�� ������ ��ȯ�Ѵ�.
	}
	
}
