package t50_Exercise;

import java.util.Scanner;

public class BankApplication {
 private static Ex20_AccountVO[] accountArray = new Ex20_AccountVO[100];
 private static Scanner scanner = new Scanner(System.in);
 
 public static void main(String[] args) {
	boolean run = true;
	
	while (run) {
		System.out.println("---------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료 | 6.삭제");
		System.out.println("---------------------------------");
		System.out.print("");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			createAccount();
		}
		else if(selectNo == 2) {
			accountList();
		}
		else if(selectNo == 3) {
			deposit();
		}
		else if(selectNo == 4) {
			withdraw();
		}
		else if(selectNo == 5) {
			run = false;
		}
		else if(selectNo == 6) {
			delete();
		}
	}
	System.out.println("프로그램 종료");
 }
//계좌 생성 메소드
 private static void createAccount() {
	 System.out.println("--------------------");
	 System.out.println("계좌생성");
	 System.out.println("--------------------");
	 System.out.println("계좌번호: ");
	 String ano = scanner.next();
	 System.out.print("계좌주: ");
	 String owner = scanner.next();
	 System.out.print("초기입금액: ");
	 int balance = scanner.nextInt();
	 
	 //계좌 생성하기
	 for(int i=0; i<accountArray.length; i++) {
		if(accountArray[i] == null) {
			accountArray[i] = new Ex20_AccountVO(ano, owner, balance);//사용자 정의 생산자
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
		}
	 }
	}
 //계좌목록보기
 private static void accountList() {
	 System.out.println("--------------------");
	 System.out.println("계좌목록보기");
	 System.out.println("--------------------");
	 
	 for(int i=0; i<accountArray.length; i++) {
		 Ex20_AccountVO account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno() +"\t");
				System.out.print(account.getOwner() +"\t");
				System.out.print(account.getBalance() +"\n");
			 }
			else break;
		 }
 		}
 //예금하기
 private static void deposit() {
	 System.out.println("--------------------");
	 System.out.println("예금");
	 System.out.println("--------------------");
	 System.out.print("계좌번호: ");
	 String ano = scanner.next();	 
	 System.out.print("예금액: ");
	 int money = scanner.nextInt();
	 
	 Ex20_AccountVO account= findAccount(ano); //계좌 검색메소드 호출
	 
	 if(account == null) {
		 System.out.println("결과: 찾는 계좌정보가 없습니다.");
		 return;
	 }
	 //get으로 불러온 값에 예금액을 더한 후 새로 저장함 
	 account.setBalance(account.getBalance()+money);
	 System.out.println("결과: 예금이 성공되었습니다.");
 }
 //출금하기
 private static void withdraw() {
	 System.out.println("--------------------");
	 System.out.println("출금");
	 System.out.println("--------------------");
	 System.out.print("계좌번호: ");
	 String ano = scanner.next();	 
	 System.out.print("출금액: ");
	 int money = scanner.nextInt();
	 
	 Ex20_AccountVO account= findAccount(ano); //계좌 검색메소드 호출
	 
	 if(account == null) {
		 System.out.println("결과: 찾는 계좌정보가 없습니다.");
		 return;
	 }
	 //get으로 불러온 값에 예금액을 뺸 후 새로 저장함 
	 account.setBalance(account.getBalance()-money);
	 System.out.println("결과: 출금이 성공되었습니다.");
 }
	//계좌 검색
	private static Ex20_AccountVO findAccount(String ano) {
		Ex20_AccountVO account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	//계좌 삭제
	private static void delete() {
		for(int i=0; i<accountArray.length; i++) {
			 System.out.println("--------------------");
			 System.out.println("계좌삭제");
			 System.out.println("--------------------");
			 System.out.println("계좌번호: ");
			 String ano = scanner.next();
			 
			 Ex20_AccountVO account= findAccount(ano);
	
			if(ano.equals(account.getAno())) {
				accountArray[i] = null;
				System.out.println("결과: 계좌가 삭제되었습니다.");
				break;
			} 
		}	// 계좌번호만 계속 입력하라고 반복함 .........
	}
}
