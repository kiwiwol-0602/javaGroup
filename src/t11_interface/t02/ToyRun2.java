package t11_interface.t02;

import java.util.Scanner;

//소비자 연령을 입력하면, 사용 가능한 장난감과 사용기능을 출력시켜주세요.

public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Toy[] toy = {new Bear(),new Robot(),new Tank(),new Airplan()};
		String[] title = {"곰돌이","로보트","탱크","비행기"};
		
		while (true) {
			System.out.println("========================================");
			System.out.println("1.연령별 사용가능 장난감 | 2.장난감 목록 | 3. 종료");
			System.out.println("========================================");
			System.out.print("");
			int selectNo = sc.nextInt();
		
			if(selectNo == 1) {
				System.out.println("아이의 연령을 입력하세요? ");
				int ageNo = sc.nextInt();
				
				System.out.println("<<사용가능한 장난감 현황>>");	
				for(int i=0; i < toy.length; i++) {
					if(ageNo >= toy[i].possibleAge()) {
						System.out.println("----------------------------------------");
						 toy[i].product(title[i]);
						 toy[i].age();
						 toy[i].moving();
						 toy[i].fire();
						 toy[i].misaile();
					}
				}
				System.out.println();
			}
			else if(selectNo == 2) {
				System.out.println("<<장난감 목록>>");	
				for(int i=0; i < toy.length; i++) {
					 toy[i].product(title[i]);
					 toy[i].age();
					 toy[i].moving();
					 toy[i].fire();
					 toy[i].misaile();
					 System.out.println();
				}
			}
			else if(selectNo == 3) {
				System.out.println("<<작업종료>>");	
				break;
			}
		}
		sc.close();
	}
}
