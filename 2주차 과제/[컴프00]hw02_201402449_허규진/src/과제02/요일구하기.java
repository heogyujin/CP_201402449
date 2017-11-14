package 과제02;
import java.util.Scanner;

public class 요일구하기 {
	

	private static Scanner input;


	public static void main(String[] args) {
		
		int year, day, month;
		int total = 0;
		char dayWeek = 0;
		
		input = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요:");
		year = input.nextInt();
		
		System.out.print("월을 입력하세요:");
		month = input.nextInt();
		
		System.out.print("일을 입력하세요:");
		day = input.nextInt();
		
		for(int i = 1900; i<= year ;i++) {
				
			if(i < year) {
				for(int j= 1; j<=12; j++) {
					Boolean LeapYear = ((i % 4 ==0) && (i % 100 !=0) || (i % 400 == 0)); 
					// 윤년해 조건
					
					Boolean month31 = ((j ==1) || (j ==3) || (j ==5) || (j ==7) || (j ==8) || (j ==10) || (j ==12));
					// 한달 일 수가 31인 달
						
					if(LeapYear && j ==2)  // 윤년이고 2월인 경우
						total += 29; // 한달은 29일
						
					else if(!LeapYear && j==2)// 윤년이 아니고 2월인 경우
						total += 28; // 한달은 28일
						
					else if(month31) // 한달이 31인 달인 경우
						total += 31; // 한달은 31일
						
					else
						total += 30; // 그 외의 경우는 30일
				}
			}else {
				for(int j = 1; j <month; j++) {
					Boolean LeapYear = ((i % 4 ==0) && (i % 100 !=0) || (i % 400 == 0)); 
					// 윤년해 조건
				
					Boolean month31 = ((j ==1) || (j ==3) || (j ==5) || (j ==7) || (j ==8) || (j ==10) || (j ==12));
					// 한달 일 수가 31인 달
				
					if(LeapYear && j ==2)  // 윤년이고 2월인 경우
						total += 29; // 한달은 29일
				
					else if(!LeapYear && j==2)// 윤년이 아니고 2월인 경우
						total += 28; // 한달은 28일
				
					else if(month31) // 한달이 31인 달인 경우
						total += 31; // 한달은 31일
				
					else
						total += 30; // 그 외의 경우는 30일
				}				
			}
		}
				
		total += day;
	
		switch(total%7) { //1900년 1월 1일이 월요일임을 이용
	
		case 0 :
			dayWeek = '일';
			break;
		case 1:
			dayWeek = '월';
			break;
		case 2 :
			dayWeek = '화';
			break;
		case 3:
			dayWeek = '수';
			break;
		case 4:
			dayWeek = '목';
			break;
		case 5 :
			dayWeek = '금';
			break;
		case 6:
			dayWeek = '토';
			break;
		}
		System.out.println(year + "년 " + month + "월" + day + "일은 " + dayWeek + "요일입니다.");
	}
}