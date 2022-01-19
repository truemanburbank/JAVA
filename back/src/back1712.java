import java.util.Scanner;

public class back1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // 고정 비용
		int b = scan.nextInt(); // 가변 비용
		int c = scan.nextInt(); // 가격
		int n = 0; // 판매량
		
		if(c<=b) // a + n*b < n*c 일 때가 필요한데 c가 b보다 작거나 같으면 식은 성립할수 없기에
			n = -1;
		else n = a/(c-b) + 1;
		
		System.out.println(n);
		scan.close();
		//고정비용 a
		//가변비용 b
		//a + n*b = n*c 를 정리해 n = (c-b)/a로 만들어 +1을 해 준다 (손익분기점을 넘어야하니까)
		//손익 분기점
	}
}
