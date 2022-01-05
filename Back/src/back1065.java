import java.util.Scanner;

public class back1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(Hansu(scan.nextInt()));
		scan.close();
	}
	
	//한수의 정의를 확실히 보자
	//1~99까지는 무조건 한수 (비교할 대상이 없으므로)
	//수의 범위를 확인한다. 1000 미만. 근데 입력 예제에 1000이 있으므로 예외처리를 한다.
	
	public static int Hansu(int n) {
		int[] x = new int[4]; // 각 자리수를 저장할 배열
		int sum = 0; //한수 개수를 저장할 변수
		
		if(n<100) {
			sum = n; // 100미만인 수는 다 한수이다.
		}
		
		if(n>=100) {
			if(n >= 1000) // 예외처리
				n = 999; //1000 미만이므로 999로 고친다
			sum = 99;
		for(int i = 100; i <= n; i++) {  // 숫자 n개 각각 확인한다
			int num = i;
			int j = 3;

			while(num!=0) {// 각 자릿수를 배열에 저장
				x[j] = num%10;
				j--;
				num /= 10;
			}
			if(((x[1]-x[2])) == x[2]-x[3]) { // 세자리수만 검사하면 되므로 등차수열의 특징을 사용
				sum +=1;
			}
		}
	}
		return sum;
}
}