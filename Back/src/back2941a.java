//BufferedRader, switch�� ���� ��
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; // Buffered�� ������ ������
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2941a {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine().trim(); // �յ� ���� ����
		int result = 0;
		int length = input.length();
		
		int i;
		for(i = 0; i<length; i++) {
			result++; // �ϴ� �ܾ� ���� ����
			switch(input.charAt(i)) {
			case 'c':
				if(i + 1< length &&(input.charAt(i+1)=='=' || input.charAt(i+1)=='-')) {
					// �Է��� 'ccc' �� ��, ������ c���� ���ܰ� �߻����� �ʵ��� ��ȣ�� �� ����
					i++; //i�� input�� ���̸� ���� �ʰ� ������ �����ϰ�, i+1���� Ȯ���Ͽ�
					// i�� �������� �ܾ �پ����
				}
				break;
			
			case 'd':
				if((i +2 < length) &&(input.charAt(i+1) == 'z') && (input.charAt(i+2)=='=')) {
					i = i +2; // �ܾ� 3���ڴϱ� 2�� �پ����
				}
				else if((i + 1 <length) && (input.charAt(i+1) == '-')) {
					i++;
				}
				break;
			
			case 'l': case 'n' : // �� ���ڰ� j�� �����ϱ� �ϳ��� ����
				if((i + 1 < length) && (input.charAt(i+1) == 'j')) {
					i++;
				}
				break;
				
			case 's': case 'z' :
				if((i + 1 < length)&& (input.charAt(i+1) == '=')) {
					i++;
				}
				break;
			}
		}
		
		bw.write(result + ""); // ���ۿ� �߰�
		bw.flush(); // ���
		
		br.close(); bw.close();
	}
}
