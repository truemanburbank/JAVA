import java.util.Scanner;

public class back2675 {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		/* 테스트케이스 수 */
		for(int i = 0; i < testcase ; i++) {
			int n = scan.nextInt(); /* 반복할 수 */
			String s = scan.next(); /* 반복할 문자 */
			
			for(int j = 0; j < s.length(); j++){ /* 문자열의 글자 하나 */
				for(int k =0; k<n ; k++){ /* 반복해서 적는 */
					System.out.print(s.charAt(j));
				}
			 }
			 System.out.print("\n");
		}
		scan.close();
    }
}