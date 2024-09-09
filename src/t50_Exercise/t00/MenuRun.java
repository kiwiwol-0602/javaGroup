package t50_Exercise.t00;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Child child = new Child();
		String choice = "y";
		while(true) {
			System.out.println("오늘의 점심메뉴를 골라주세요.");
			System.out.println("(쌀밥과 불고기는 기본 메뉴입니다.)");
			System.out.println(child.name + "을 주문하시겠습니까?");
			String choiceYN = sc.next();
			
			if(choice.equals(choiceYN)) {
			child.rice();
			child.bulgogi();
			
			child.dubu();
			child.miyeok();
			child.yoplait( );
			child.banana( );
			child.milk( );
			child.almond();
			}
			
			break;
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
