import java.util.Scanner;

public class back4344a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testcase = scan.nextInt(); // 테스트 케이스의 개수
		for(int i = 0 ; i < testcase ; i ++)
		{
			double avg = 0;
			int sum = 0;
			int n = 0; // 평균 넘은 학생 수
			int N = scan.nextInt(); // 학생 수
			int arr[] = new int[N]; // 학생 수만큼 배열 생성
			
			for(int j = 0; j < N ; j++) {
				arr[j] = scan.nextInt();
				sum += arr[j];
			}
			avg = (double)sum / N; // 구한 합계가지고 평균을 구함
			
			for(int j = 0; j < N ; j++) {
				if(arr[j]>avg) { // 다시 배열 하나하나 평균과 비교헤서 평균 넘는 사람 카운트 ++
					n++;
				}
			}
			System.out.printf("%.3f%%\n", (double)n/N*100.0); 
		}// 반올림해서 소수 셋째 %.3f
		
		scan.close();
	}
	
}
