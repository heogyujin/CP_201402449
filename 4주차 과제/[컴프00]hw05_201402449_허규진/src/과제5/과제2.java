package 과제5;
import java.util.Scanner;

public class 과제2 {

	public static void main(String []args){
	
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String s = input.nextLine();
		char s2;
		for(int i=0; i<s.length() ; i++){
			
			s2 = s.charAt(i);
			
			if (s2 >= 'a' && s2 <= 'z')
			
					s2 = (char)(s2- ('a' -'A'));
	
				
           else if (s2 >= 'A' && s2 <= 'Z')   

                 	s2 = (char)(s2+('a' -'A'));
		
			System.out.print(s2);
  			}
  			
	}
}