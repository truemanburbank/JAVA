import java.util.Scanner;

public class back4344a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testcase = scan.nextInt(); // �׽�Ʈ ���̽��� ����
		for(int i = 0 ; i < testcase ; i ++)
		{
			double avg = 0;
			int sum = 0;
			int n = 0; // ��� ���� �л� ��
			int N = scan.nextInt(); // �л� ��
			int arr[] = new int[N]; // �л� ����ŭ �迭 ����
			
			for(int j = 0; j < N ; j++) {
				arr[j] = scan.nextInt();
				sum += arr[j];
			}
			avg = (double)sum / N; // ���� �հ谡���� ����� ����
			
			for(int j = 0; j < N ; j++) {
				if(arr[j]>avg) { // �ٽ� �迭 �ϳ��ϳ� ��հ� ���켭 ��� �Ѵ� ��� ī��Ʈ ++
					n++;
				}
			}
			System.out.printf("%.3f%%\n", (double)n/N*100.0); 
		}// �ݿø��ؼ� �Ҽ� ��° %.3f
		
		scan.close();
	}
	
}
