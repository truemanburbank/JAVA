import java.util.Scanner;

public class back2675 {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		/* �׽�Ʈ���̽� �� */
		for(int i = 0; i < testcase ; i++) {
			int n = scan.nextInt(); /* �ݺ��� �� */
			String s = scan.next(); /* �ݺ��� ���� */
			
			for(int j = 0; j < s.length(); j++){ /* ���ڿ��� ���� �ϳ� */
				for(int k =0; k<n ; k++){ /* �ݺ��ؼ� ���� */
					System.out.print(s.charAt(j));
				}
			 }
			 System.out.print("\n");
		}
		scan.close();
    }
}