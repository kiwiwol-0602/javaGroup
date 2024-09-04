package t09_Exercise;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance && balance<=MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	
//	public void setBalance(int balance) {
//		if(0<=balance && balance<=1000000) {
//		this.balance = balance;
//		}
//		else {
//			System.out.println(" 0에서 1,000,000 범위의 값을 넣어주세요");
//		}
//	}
	
	
	
	
	
	
}
