import java.util.Scanner;

class BankAccount{
	
	int accountNumber; //계좌번호
	String owner; // 예금주
	int balance=0; // 잔액 표시
	
	void deposit(int amount) {
		
		balance += amount;
		
	}
	
	void withdraw(int amount) {
		
		if(amount>balance) 
			
			System.out.println("계좌 이체 실패");
				
		balance -= amount;
		
	}
	public String toString() {
		
		return "현재잔액: " + balance;
	}
	
	public void sendAccount(int amount, BankAccount otherAccount) {
	
		
		otherAccount.deposit(amount);
		this.withdraw(amount);
		
		
	}
	
}

public class hw07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		BankAccount bank1 = new BankAccount();
		BankAccount bank2 = new BankAccount();
		
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호 : ");
		bank1.accountNumber = input.nextInt();
		System.out.print("예금주 : ");
		bank1.owner = input.next();
		System.out.print("초기 잔액 : ");
		bank1.balance = input.nextInt();
		
		System.out.println();
		
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌번호 : ");
		bank2.accountNumber = input.nextInt();
		System.out.print("예금주 : ");
		bank2.owner = input.next();
		System.out.print("초기 잔액 : ");
		bank2.balance = input.nextInt();

		System.out.println();
		
		System.out.print("계좌1에서 계좌2로 송금할 금액 : ");
		int sendMoney = input.nextInt();
		bank1.sendAccount(sendMoney, bank2);
		System.out.println("===============================");
		
		System.out.println("계좌1");
		System.out.println("계좌번호: " +bank1.accountNumber);
		System.out.println("예금주: " +bank1.owner);
		System.out.println(bank1.toString());
		System.out.println();
		
		System.out.println("계좌2");
		System.out.println("계좌번호: " +bank2.accountNumber);
		System.out.println("예금주: " +bank2.owner);
		System.out.println(bank2.toString());	
	}
}
