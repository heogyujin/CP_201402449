package 과제03;

import java.util.Scanner;

public class 알파벳구분 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("알파벳 하나를 입력하세요 :");
		char al = input.next().charAt(0);
		
		switch(al) {
					
			case 'A' : case 'E' : case 'I' : case 'O' : case 'U' : case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
				System.out.println("모음 입니다."); 
				break;
				
			default :
				System.out.println("자음 입니다.");
		}
		
	}

}