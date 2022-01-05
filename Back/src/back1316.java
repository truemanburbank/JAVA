// boolean �迭 ����� ��, ����ϴ� �� *********
// ���ĺ� �迭�� ���� �ѹ� �������� true�� ���� �ٲ��
// aaaba sdsd  >> �ѹ� ���Դ� ���ڰ� �̾����� �ʴ� �̻� ���߿� �ߺ����� ������ �� ��

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0 ; i < test_case ; i++) {
			String word = br.readLine().trim();
			
			if(Check(word) == true) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count) + "");
		bw.flush();
		
		br.close(); bw.close();
	}
	
	static boolean Check(String str) {
		boolean[] check = new boolean[26]; //�ش��ϴ� ���ĺ��� �ִ���, ������ true
		int prev = 0; 
		// �ݺ������� ���ڸ� �����ö� �ռ� ���ڿ� ���ӵǴ���, �ƴ��� �Ǻ�
		
		for(int i = 0; i < str.length(); i++) { //���ڼ���ŭ ����
			int now = str.charAt(i); // i��° ���� ���� (���� ����)
			//int�� �����ؼ� ���ڰ����� ����
			
			//�ռ� ���ڿ� i��° ���ڰ� ���� �ʴٸ�?
			if(prev != now) {
				//�ش� ���ڰ� ó�� ������ ���
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			} // �������� �� �׳� �ǳʶ�
		}
		return true;
	}
}
