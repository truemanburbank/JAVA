import java.util.Scanner;

public class back1152a1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim(); //앞,뒤 공백제거
		
		scan.close();
		
		System.out.println(s.split(" ").length);
		// split으로 " "기준으로 자름
		// 그 개수를 바로 출력
	}
}
