package t11_interface.t02;

import java.util.Scanner;

//소비자 연령을 입력하면, 사용 가능한 장난감과 사용기능을 출력시켜주세요.

public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("장난감을 선물받는 아이의 연령을 입력하세요? ");
		int ageNo = sc.nextInt();
		
		
		
		System.out.println("연령별 장난감 기능 현황");
		
		 Toy[] toy = {new Bear(),new Robot(),new Tank(),new Airplan()};
		 String[] title = {"곰돌이","로보트","탱크","비행기"};
		 
		 for(int i=0; i < toy.length; i++) {
			 toy[i].product(title[i]);
			 toy[i].age();
			 toy[i].moving();
			 toy[i].fire();
			 toy[i].misaile();
			 System.out.println();
		 }
		 sc.close();
	}
}
