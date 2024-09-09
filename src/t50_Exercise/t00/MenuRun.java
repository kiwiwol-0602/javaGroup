package t50_Exercise.t00;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Child child = new Child();
		String name[] = {"쌀밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
		
		System.out.println("오늘의 점심메뉴를 골라주세요.");
		System.out.println("(쌀밥과 불고기는 기본 메뉴입니다.)");
		child.tot +=2500;
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i] + "을 주문하시겠습니까?");
			String choice = sc.next();
			
			child.rice(i, choice);
			child.bulgogi(i, choice);
			child.dubu(i, choice);
			child.miyeok(i, choice);
			child.yoplait(i, choice);
			child.banana(i, choice);
			child.milk(i, choice);
			child.almond(i, choice);	
		}
		System.out.println();
		System.out.println("============================");
		System.out.println("기본으로 제공되는 쌀밥, 불고기 외 ");
		System.out.println();
		System.out.println(child.food);
		System.out.println("을/를 주문하셨습니다.");
		System.out.println("----------------------------");
		System.out.println("총 금액 : "+child.tot+"원");
		System.out.println("============================");
		sc.close();
	}
}

