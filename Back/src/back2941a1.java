//�迭�� ġȯ�� �̿��ϴ� ���

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2941a1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String input = br.readLine().trim();
		int result = 0;
		
		int i;
		for(i = 0 ; i < word.length; i++) { // word�� ���̸�ŭ ���鼭
			if(input.contains(word[i])) { // word�� Ư�����ڸ� input�� ������ �ִٸ�
				input = input.replaceAll(word[i], "*"); // �� Ư�� ���ڸ� ��� *���� �ٲ�
			}
		}
		
		result = input.length(); // ���� ���� ġȯ�� *�� ������ input�� ���̰� ��
		
		bw.write(result + "");
		bw.flush();
		
		br.close(); bw.close();
	}
}
