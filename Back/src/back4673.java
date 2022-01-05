
public class back4673 {
	public static void main(String[] args) {
		int[] selfnumber = new int[100001]; //*****selfnumber를 담을 배열
		
		for(int i = 1; i <=10000; i++) {
			selfnumber[d(i)] = 1; // d(i)의 값에 해당하는 인덱스의 배열에 1이라고 표시
		}
		
		for(int i =1 ; i <=10000; i++) { // 반복문을 돌려서 0이 들어 있는 배열의 인덱스만 출력
			if(selfnumber[i] == 0)
				System.out.println(i);
			}
		}
	
	public static int d(int n) {
		int sum = n; // 이제 여기에 나눗셈들을 더해서 넣는
		while(n>0) // 반복문을 통해 0이 될 때까지
		{
			sum = sum + (n%10); // 일의 자리 숫자를 더함
			n = n/10; //10으로 나눠서 뒤에 자리를 하나 없앰
			// ex) 365 => 36, 여기서 일의 자리 숫자를 또 더하면 됨
		}
		return sum;
	}
}
