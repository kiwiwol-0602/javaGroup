package t03_Constructor;

public class Test3Run {
	public static void main(String[] args) {
		new Test3(); // 기본생성자를 만들어 줘야함
		System.out.println();
	// 메소드 영역에 올라가면서 기본 생성자 영역에 있는게 실행됨
	// 읭 ????
	//전역변수: 아무데나 들어가도 그대로 쓸수 있다 ?
	// 생성자의 실행블럭에서도 만들어서 쓸수 있음

		// 불러오는 값
		new Test3(500);// 정수를 넘겼으니까 정수받는 얘가 가져감
		 // 방식에 따라서 불러오는 값이 정해짐
		new Test3(3.14);
		System.out.println("====================");
		
		Test3 t31= new Test3();
		System.out.println("1 : " + t31.atom1);
		// 초기값
		
		Test3 t32= new Test3();
		System.out.println("2 : " + t32.atom1);
		
		t31.atom1 = -100;
		System.out.println("3 : " + t31.atom1);
		System.out.println("4 : " + t32.atom1);
		System.out.println();
		
		Test3 t33 = new Test3(1234);
		t33.atom1 = 4321;
		System.out.println("5 : " + t33.atom1);
		System.out.println("6 : " + t31.atom1);
		System.out.println("7 : " + t32.atom1);
		
		
	
	
	
	}
}
