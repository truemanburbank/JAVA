
public class back4673 {
	public static void main(String[] args) {
		int[] selfnumber = new int[100001]; //*****selfnumber�� ���� �迭
		
		for(int i = 1; i <=10000; i++) {
			selfnumber[d(i)] = 1; // d(i)�� ���� �ش��ϴ� �ε����� �迭�� 1�̶�� ǥ��
		}
		
		for(int i =1 ; i <=10000; i++) { // �ݺ����� ������ 0�� ��� �ִ� �迭�� �ε����� ���
			if(selfnumber[i] == 0)
				System.out.println(i);
			}
		}
	
	public static int d(int n) {
		int sum = n; // ���� ���⿡ ���������� ���ؼ� �ִ�
		while(n>0) // �ݺ����� ���� 0�� �� ������
		{
			sum = sum + (n%10); // ���� �ڸ� ���ڸ� ����
			n = n/10; //10���� ������ �ڿ� �ڸ��� �ϳ� ����
			// ex) 365 => 36, ���⼭ ���� �ڸ� ���ڸ� �� ���ϸ� ��
		}
		return sum;
	}
}
