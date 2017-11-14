import java.util.*;

public class MaxandMin {
	public static void main(String[] args) {
		
		int []number = new int[10];
		Random r = new Random();
		for(int i=0; i<10 ; i++) {
			
			number[i] = r.nextInt(101);
		}
		
		int max = number[0];
		int min = number[0];
		
		for(int k=1; k<10 ; k++) {
			
					if(number[k]>=max)
						
						max = number[k];
		}
		
		for(int j=1; j<10 ; j++) {
			
			if(number[j]<=min)
				
				min = number[j];
		}
			
		System.out.println("10개의 수 중 가장 큰 숫자: "+max);
		System.out.println("10개의 수 중 가장 작은 숫자: "+min);
		
	}

}
