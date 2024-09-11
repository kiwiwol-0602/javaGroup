package t18_Collection.t03_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 	
 */
public class Test1 {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<>();
//		List<String> arrayList = new ArrayList<>();
		
		
		System.out.println("1.arrayList크기 : " + arrayList.size());
		System.out.println("1.arrayList toString() : " + arrayList.toString());
		System.out.println("1.arrayList : " + arrayList);
		System.out.println();
		
		//자료삽입(add)
		arrayList.add("홍길동");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		arrayList.add("오하늘");
		arrayList.add("고인돌");
		arrayList.add("소나무");
		System.out.println("2.arrayList크기 : " + arrayList.size());
		System.out.println("2.arrayList : " + arrayList);
		System.out.println();
		
		arrayList.add("홍길동3");
		arrayList.add("김말숙3");
		arrayList.add("이기자3");
		arrayList.add("오하늘3");
		arrayList.add("고인돌3");
		System.out.println("3.arrayList크기 : " + arrayList.size());
		System.out.println("3.arrayList : " + arrayList);
		System.out.println();
		
		//자료검색(get)
		System.out.println("4.arrayList.get(1) : "+arrayList.get(1));
		System.out.println("4.arrayList.get(5) : "+arrayList.get(5));
		System.out.println("4.arrayList.get(마지막위치) : "+arrayList.get(arrayList.size()-1));
		System.out.println();
		
		//자료수정
		arrayList.set(1, "강감찬");
		System.out.println("5.arrayList크기 : " + arrayList.size());
		System.out.println("5.arrayList : " + arrayList);
		System.out.println();
		
		//자료삭제
		arrayList.remove(1);
		arrayList.remove(3);
		arrayList.remove(5);
		System.out.println("6.arrayList크기 : " + arrayList.size());
		System.out.println("6.arrayList : " + arrayList);
		System.out.println();
		
		//자료삽입(add(인덱스,요소))
		arrayList.add(1, "김그린");
		System.out.println("7.arrayList크기 : " + arrayList.size());
		System.out.println("7.arrayList : " + arrayList);
		System.out.println();

		//향상된 for문을 이용한 자료의 출력
		for(String name : arrayList) {
			System.out.print(name + "/");
		}
		System.out.println("\n");
		
		//모든 자료 삭제
		arrayList.clear();
		System.out.println("8.arrayList크기 : " + arrayList.size());
		System.out.println("8.arrayList : " + arrayList);
		System.out.println();
	}
}
