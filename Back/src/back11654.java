import java.util.Scanner;

public class back11654 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Scanner는 "문자"를 받으려면 nextLine()이나 next()를 써야 함
		//받은 뒤 "문자열"을 "charAt(0)"으로 "문자"로 잘라내주어야 함
		
		int ch = scan.next().charAt(0);
		// 받은 문자를 int형에 담으면 아스키 코드값으로 변형된다.
		
		System.out.println(ch);
		scan.close();
	}
}
