package ��ǻ�����α׷���1;
import java.util.Scanner;

public class abbb2 {
		
	public static void main(String args[]) {
			
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;
		int k;
		System.out.print("��ȯ�� �� �Է�: ");
		x = input.nextInt();
		y = x/3600;
		z = (x%3600)/60;
		k = (x%3600)%60;
			
		System.out.print( +x+ "�ʴ� " +y+ "�ð� " +z+ "�� " +k+ "�� �Դϴ�.");
			
		}

}

	
