package t50_Exercise;

import java.util.Scanner;

/*<숙제>
 	단어(문장)을 입력받은 후, 입력받은 글자중에서 특정 문자가 어디/오디에 위치하고 있는지를 출력하시오.
 	예) 문장: Welcome to Korea!
 		 찾고자 하는 알파벳 : o
 		 o를 포함하고 있는 갯수 : 3개
 		 o가 위치한 곳 : 4 / 9 / 12
 */
public class T5_indexOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		String temp ="";
		
		System.out.println("단어(문장)을 입력하세요? ");
		String str = sc.nextLine();
		
		
		System.out.println("찾을 문자를 입력하세요? ");
		char ch = sc.next().charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				temp += i +"/";
				cnt++;
			}
		}
		System.out.print("문자"+ch+"가 위치한 곳 : ");
		System.out.println(temp.substring(0,temp.length()-1));
		System.out.println("문자"+ch+"를 포함하고 있는 갯수 : "+cnt+"개");	
		sc.close();
	}
}
