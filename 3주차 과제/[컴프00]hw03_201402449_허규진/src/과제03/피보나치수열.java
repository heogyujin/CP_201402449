package 과제03;

public class 피보나치수열 {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int sum=0;
		
			for(int i=0 ;i<10; i++) {
				first = second;
				second = sum;
				sum = first + second;
				System.out.println(sum);
				
			}
			
	}
}
