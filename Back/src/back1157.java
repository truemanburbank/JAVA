import java.util.Scanner;

public class back1157 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        String word = scan.next().toUpperCase(); // �빮�ڷ� �Է¹���
        int[] alpha = new int[26]; // ���ĺ� ������ �迭
        
        scan.close();
        
        for(int i = 0 ;i <word.length(); i++){ // ****�ش��ϴ� ������ �ƽ�Ű�ڵ带 �ε����� ���� �迭�� ���� ������Ŵ
           alpha[word.charAt(i)-'A']++; //ī��Ʈ, -'A'�ϴ� ������ 0�� 'A'�� ���߱� ����
        }
        
        int max = 0;
        char ch = '?';
        
        for(int i = 0 ; i < alpha.length ; i++){
            if(max < alpha[i]){
                max = alpha[i];     // �ִ밪�� ���ؼ�
                ch = (char)(i+'A'); // �ִ밪�� �ε����� �ٽ� A�� ���� �ش��ϴ� ���ڷ� ����
            }
            else if(max == alpha[i]){//���� �ִ밪�� �ߺ��Ǵ� ī��Ʈ ���� ������ �ߺ��̹Ƿ� ? ���
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}