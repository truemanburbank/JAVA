import java.util.Scanner;
import java.util.StringTokenizer;

public class back4344 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // �׽�Ʈ ���̽��� ����
		double stu = 0; // ����� �Ѵ� �л��� ��
		scan.nextLine(); // ���� ���� ����
		
		double[] avg = new double[a]; // �� ���� ����� ���� �迭
		int[] sum = new int[a]; // �� ���� ���� ���� �迭
		String[] line = new String[a]; // �� ���� ������ ���� �迭
		String[] line2 = new String[a]; // �� ���� ������ ���� �迭2
		String[] first = new String[a]; // ù ��° ����(�л� ��)�� ���� �迭
		int size = line.length;
		String answer; // ������ ���� ���ڿ�
		
		for(int i = 0; i <size; i++) {
			line[i] = scan.nextLine();
			line2 = line.clone();
		}
		
		for(int i = 0; i < size ; i++) {
			StringTokenizer token = new StringTokenizer(line[i], " "); // �������� ���ڸ� ������
			first[i] = token.nextToken(); // �ݺ��� �� �ؼ� ù ��° ���ڸ� ���
			
			while(token.hasMoreTokens()) { //���� ��ū�� �Ἥ ù ��° ���� �������� ������
				line[i] = token.nextToken(); // line�� �ϳ��� ��� ��� �ٽ� �ű⿡ ���
				sum[i] += Integer.parseInt(line[i]); // Integer.parseInt(): String�� Int�� �ٲ㼭 ����� �� �ְ� ����
			}
			
			avg[i] = (double)sum[i]/Integer.parseInt(first[i]); // ��� ����
		}
		
		for(int i = 0; i < size; i ++) {
			StringTokenizer fake = new StringTokenizer(line2[i], " ");
			while(fake.hasMoreTokens()) {
				line2[i] = fake.nextToken(); 
				if(avg[i]<Integer.parseInt(line2[i])) { // line2�迭 ��ū���� �ϳ��� �̾Ƽ� ��պ��� ���� ������ �л� �� ���ϱ�
					stu++;
				}
		}
			answer = String.format("%.3f",stu/Integer.parseInt(first[i])*100.0);
			System.out.println(answer+"%");
			stu = 0;
		}
		
		scan.close();
	}
}