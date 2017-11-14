package 과제02;
import java.util.Scanner;
import java.util.Random;


public class 가위바위보 {

	public static void main(String[] args) {
		
		int countCom=0;
		int countUser=0;
		int userNum,com,i;
		for(i=1 ; i<=7 ;i++) {
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("stage "+i+"> user: " +countUser+ "승  vs computer: " +countCom+ "승");
		System.out.println("-----------------------------------------------------------------------------");
		
		Random r = new Random();
		com = r.nextInt(9)+1;
		if((com == 1) || (com == 4) || (com == 7))
			com = 0;
		
		else if((com == 2) || (com ==5) || (com ==8))
			
			com = 1;
	
		else 
			com = 2;
		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
	
		Scanner input = new Scanner(System.in);
		String RSP = input.nextLine();
		switch(RSP) {
		
		case "가위" :
			userNum = 0; break;
		case "바위" :
			userNum = 1; break;
		case "보" :
			userNum = 2; break;
		default :
			userNum = 3;
			
		}
		
		if(userNum==com)
			System.out.println("비겼습니다.");
		else if((userNum == 0 && com ==2) || (userNum == 1 && com ==0) || (userNum == 2 && com ==1)) {
			System.out.println("당신이 이겼습니다.");
			countUser++;
		}
		else {
			System.out.println("당신이 졌습니다.");
			countCom++;
		}
		
		if(i==7) { // 최종 승자 가리기
			System.out.println("");
			if(countUser>countCom)
				System.out.println("최종 승자는 당신입니다.");
			else if(countUser<countCom)
				System.out.println("최종 승자는 컴퓨터입니다.");
			else
				System.out.println("최종 승부는 무승부 입니다.");		
			}
		} // for 반복문의 끝
		
	}	
		
}

