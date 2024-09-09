package t15_API.t01_Object;

import java.util.HashMap;
//HashCode
public class Test1 {
	public static void main(String[] args) {
		// HashMap: Collection Framework의 한 종류 = 키(key)와 Value(값)으로 데이터를 표현
		//Generic: 하위 타입을 정의
		//박싱 : 책으로 한번 더 확인하기 ! 레퍼클래스는 기억이 안나고 왜 언박싱만 기억나냐 .....하
		//인티저... integer 이것도 봤는데 ... 책으로 다시 공부하기
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "데이터1");
		map.put(1, "데이터2");
		map.put(2, "데이터3");
		System.out.println(map); //.toString() 생략되어있음
		
		HashMap<Aa, String> map2 = new HashMap<>();
		map2.put(new Aa("첫번째"), "홍길동");
		map2.put(new Aa("첫번째"), "김말숙");
		map2.put(new Aa("두번째"), "이기자");
		map2.put(new Aa("두번째"), "이기자");
		System.out.println(map2);
		//출력결과: 객체주소(hashcode)를 통한 자료의 저장/처리, 
		//{t15_API.Object.Aa@7852e922=이기자, t15_API.Object.Aa@15db9742=홍길동, 
		//t15_API.Object.Aa@6d06d69c=김말숙, t15_API.Object.Aa@4e25154f=이기자}
		//== 이퀄 값비교 ===값과 객체타입 모두 비교
	}
}

class Aa{
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb{
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
}
