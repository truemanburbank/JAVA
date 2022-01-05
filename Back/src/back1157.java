import java.util.Scanner;

public class back1157 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        String word = scan.next().toUpperCase(); // 대문자로 입력받음
        int[] alpha = new int[26]; // 알파벳 개수의 배열
        
        scan.close();
        
        for(int i = 0 ;i <word.length(); i++){ // ****해당하는 문자의 아스키코드를 인덱스로 가진 배열의 값을 증가시킴
           alpha[word.charAt(i)-'A']++; //카운트, -'A'하는 이유는 0을 'A'로 맞추기 위해
        }
        
        int max = 0;
        char ch = '?';
        
        for(int i = 0 ; i < alpha.length ; i++){
            if(max < alpha[i]){
                max = alpha[i];     // 최대값을 구해서
                ch = (char)(i+'A'); // 최대값인 인덱스에 다시 A를 더해 해당하는 문자로 만듦
            }
            else if(max == alpha[i]){//구한 최대값과 중복되는 카운트 값이 있으면 중복이므로 ? 출력
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}