package t11_interface.t03;

import java.util.Scanner;

// 배역을 입력하면 해당 배역의 역할을 출력하세요

public class ActionRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Action[] action = {new PoliceMan(), new FireMan(), new Chef()};
		int choice = 0;
		
		while(true) {
			System.out.println("배역을 선택하세요? ");
			System.out.println("1.경찰관 2.소방관 3.요리사 0.종료");
			choice=sc.nextInt();
			
			if(choice < 1 || choice > 3) break;
			
			actorlist(action[choice-1]);
		}
		System.out.println("작업끝");
		sc.close();
	}
	
	private static void actorlist(Action action) {
		action.catching();
		action.search();
		action.fire();
		action.rescue();
		action.pasta();
		action.pizza();
		System.out.println();
	}
}


