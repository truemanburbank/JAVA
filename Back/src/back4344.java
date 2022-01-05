import java.util.Scanner;
import java.util.StringTokenizer;

public class back4344 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // 테스트 케이스의 개수
		double stu = 0; // 평균을 넘는 학생의 수
		scan.nextLine(); // 개행 문자 제거
		
		double[] avg = new double[a]; // 각 줄의 평균을 담을 배열
		int[] sum = new int[a]; // 각 줄의 합을 담을 배열
		String[] line = new String[a]; // 한 줄의 내용을 담을 배열
		String[] line2 = new String[a]; // 한 줄의 내용을 담을 배열2
		String[] first = new String[a]; // 첫 번째 문자(학생 수)를 담을 배열
		int size = line.length;
		String answer; // 정답을 담을 문자열
		
		for(int i = 0; i <size; i++) {
			line[i] = scan.nextLine();
			line2 = line.clone();
		}
		
		for(int i = 0; i < size ; i++) {
			StringTokenizer token = new StringTokenizer(line[i], " "); // 공백으로 문자를 나누기
			first[i] = token.nextToken(); // 반복을 안 해서 첫 번째 문자만 담기
			
			while(token.hasMoreTokens()) { //같은 토큰을 써서 첫 번째 공백 다음부터 시작함
				line[i] = token.nextToken(); // line에 하나씩 끊어서 담고 다시 거기에 담기
				sum[i] += Integer.parseInt(line[i]); // Integer.parseInt(): String을 Int로 바꿔서 계산할 수 있게 만듬
			}
			
			avg[i] = (double)sum[i]/Integer.parseInt(first[i]); // 평균 구함
		}
		
		for(int i = 0; i < size; i ++) {
			StringTokenizer fake = new StringTokenizer(line2[i], " ");
			while(fake.hasMoreTokens()) {
				line2[i] = fake.nextToken(); 
				if(avg[i]<Integer.parseInt(line2[i])) { // line2배열 토큰으로 하나씩 뽑아서 평균보다 높은 성적인 학생 수 구하기
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