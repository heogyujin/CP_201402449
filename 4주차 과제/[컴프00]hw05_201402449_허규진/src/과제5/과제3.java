package 과제5;
import java.util.Scanner;

class Date{

	
		void printEastern(int year, int month, int day){
		
			System.out.println("동양식 날짜 표현:"+year+"."+month+"."+day);
			
		}
		
		void printWestern(int year, int month, int day){
		
		String monthEnglish=null;
		
			if(month == 1)
				monthEnglish = "January";
			else if(month == 2)
				monthEnglish = "February";
			else if(month == 3)
				monthEnglish = "March";
			else if(month == 4)
				monthEnglish = "April";
			else if(month == 5)
				monthEnglish = "May";
			else if(month == 6)
				monthEnglish = "Jun";
			else if(month == 7)
				monthEnglish = "July";
			else if(month == 8)
				monthEnglish = "August";
			else if(month == 9)
				monthEnglish = "September";
			else if(month == 10)
				monthEnglish = "October";
			else if(month == 11)
				monthEnglish = "November";
			else if(month == 12)
				monthEnglish = "December";
				
			
		
			System.out.println("서양식 날짜 표현:"+monthEnglish+ " " +day+","+year);
			
		}	
		
		
}
	

public class 과제3 {

	public static void main(String []args){
	
		int year,month,day;
		Date d = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력:");
		year = input.nextInt();
		System.out.print("월 입력:");
		month = input.nextInt();
		System.out.print("일 입력:");
		day = input.nextInt();
		
		d.printEastern(year,month,day);
		
		d.printWestern(year,month,day);
		
		
	}
	
			

}
