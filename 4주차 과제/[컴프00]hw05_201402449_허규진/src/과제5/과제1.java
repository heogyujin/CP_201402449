package 과제5;
import java.util.Scanner;

public class 과제1 {

	public static void main(String []args){
	
		Scanner input = new Scanner(System.in);
		
		int count1 = 0; // 모음 개수 카운트
		int count2 = 0; // 자음 개수 카운트
		char s2; // 입력 받는 문자열의 알파벳을 하나씩 저장할 공간
		
		System.out.print("문자열을 입력하시오.");
		String s = input.nextLine();
		
		for(int i = 0; i < s.length(); i++){
		
			s2 = s.charAt(i);
			
			if((s2 >= 'A' && s2 <= 'Z') || (s2 >= 'a' && s2 <= 'z')){
				if(s2=='a' || s2=='e' || s2 == 'i' || s2 == 'o' || s2 == 'u')
					count1++;
				else
					count2++;
			}
		}
			
		System.out.println("자음의 개수: " +count2+ "개");
		
		System.out.println("모음의 개수: " +count1+ "개");
	

	}
}
