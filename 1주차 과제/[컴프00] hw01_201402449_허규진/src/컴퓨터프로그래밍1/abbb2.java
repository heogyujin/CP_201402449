package 컴퓨터프로그래밍1;
import java.util.Scanner;

public class abbb2 {
		
	public static void main(String args[]) {
			
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;
		int k;
		System.out.print("변환할 초 입력: ");
		x = input.nextInt();
		y = x/3600;
		z = (x%3600)/60;
		k = (x%3600)%60;
			
		System.out.print( +x+ "초는 " +y+ "시간 " +z+ "분 " +k+ "초 입니다.");
			
		}

}

	
