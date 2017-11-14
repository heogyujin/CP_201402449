import java.util.Scanner;

class BankAccount{
	
	int accountNumber; //���¹�ȣ
	String owner; // ������
	int balance=0; // �ܾ� ǥ��
	
	void deposit(int amount) {
		
		balance += amount;
		
	}
	
	void withdraw(int amount) {
		
		if(amount>balance) 
			
			System.out.println("���� ��ü ����");
				
		balance -= amount;
		
	}
	public String toString() {
		
		return "�����ܾ�: " + balance;
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
		
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		bank1.accountNumber = input.nextInt();
		System.out.print("������ : ");
		bank1.owner = input.next();
		System.out.print("�ʱ� �ܾ� : ");
		bank1.balance = input.nextInt();
		
		System.out.println();
		
		System.out.println("����2 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		bank2.accountNumber = input.nextInt();
		System.out.print("������ : ");
		bank2.owner = input.next();
		System.out.print("�ʱ� �ܾ� : ");
		bank2.balance = input.nextInt();

		System.out.println();
		
		System.out.print("����1���� ����2�� �۱��� �ݾ� : ");
		int sendMoney = input.nextInt();
		bank1.sendAccount(sendMoney, bank2);
		System.out.println("===============================");
		
		System.out.println("����1");
		System.out.println("���¹�ȣ: " +bank1.accountNumber);
		System.out.println("������: " +bank1.owner);
		System.out.println(bank1.toString());
		System.out.println();
		
		System.out.println("����2");
		System.out.println("���¹�ȣ: " +bank2.accountNumber);
		System.out.println("������: " +bank2.owner);
		System.out.println(bank2.toString());	
	}
}
