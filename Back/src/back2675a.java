import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class back2675a {                   //bufferedreader�� ����ó���� �� ����� �Ѵ�
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner�� ����
		
		int T = Integer.parseInt(br.readLine());
		//testcase �Է¹���
		//bufferedreader�� �Է¹��� �� readLine�� ���µ� ������ String����
		//��ȯ�ż� ����ȯ�� ����� �Ѵ�.
		
		for(int i = 0; i <T; i++) {
			String[] str = br.readLine().split(" "); //���� �и�
			//.split(" ") >>>> ���鸶�� ������ ��� �迭�� ����
			// ���� �Է� 3 ABC
			
			int R = Integer.parseInt(str[0]); // String -> int, �ݺ��� Ƚ��, 3 ����
			String S = str[1]; // �ݺ��� ���ڿ�, ABC ����
			
			for(int j = 0; j < S.length(); j++) {  //���ڿ��� ���̸�ŭ
				for(int k = 0; k < R; k++) { // �ݺ��� Ƚ��
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
