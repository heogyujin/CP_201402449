package 컴퓨터프로그래밍1;


import java.util.Scanner;

public class abbb1 {
		
	public static void main(String args[]) {
			
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("년도를 입력하세요: ");
		x = input.nextInt();
			
		if(x%4==0 && !(x%100==0))  
				
				System.out.println(+x+" 년은 윤년입니다");
				
		else if(x%400==0) 
					
				System.out.println(+x+ " 년은 윤년입니다.");				
			
		else
				
				System.out.println(+x+" 년은 윤년이 아닙니다.");

		}
	}



