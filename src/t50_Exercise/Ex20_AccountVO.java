package t50_Exercise;

public class Ex20_AccountVO { //저장용
	private String ano;  		//계좌번호
	private String owner;		//계좌주
	private int balance;		//입출금 금액
	
	
		
	public Ex20_AccountVO(String ano, String owner, int balance) { // 입력용
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
