package ��ǻ�����α׷���1;


import java.util.Scanner;

public class abbb1 {
		
	public static void main(String args[]) {
			
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("�⵵�� �Է��ϼ���: ");
		x = input.nextInt();
			
		if(x%4==0 && !(x%100==0))  
				
				System.out.println(+x+" ���� �����Դϴ�");
				
		else if(x%400==0) 
					
				System.out.println(+x+ " ���� �����Դϴ�.");				
			
		else
				
				System.out.println(+x+" ���� ������ �ƴմϴ�.");

		}
	}



