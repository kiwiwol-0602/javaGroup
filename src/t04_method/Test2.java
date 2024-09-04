package t04_method;

public class Test2 {
	void mod1() {
		System.out.println("안녕1");
	}
	
		void mod1(String name) {
			System.out.println("안녕1");
	}
		
		void mod1(String name, int age) {
			System.out.println(name + "안녕1, 나이는 " + age);
		}
		
		void mod1(int age, String name) {
			System.out.println(name + "안녕1, 나이는 " + age);
		}
		
// 	void mod1(String irum, int nai) {
//		System.out.println(name + "안녕1, 나이는 " + age);
//	}
		//리턴타입은 오버로딩의 조건에 영향을 미치지 않음
		//중요한건 타입 갯수 순서/ 전체리턴타입은 영향을 안줌
//		String mod1(int age, String name) {
//			return (name + "안녕1, 나이는 " + age);
//		}
		
		
}
