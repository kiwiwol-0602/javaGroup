package t11_interface.t01;

public class TestRun {
	public static void main(String[] args) {
//	new Test1(); // 인터페이스는 생성해서 사용할 수 없다.

		Seoul seoul = new Seoul();
		seoul.data();
		seoul.date2();
		System.out.println();
		
		Test1.date3(); // static 인터페이스도 클래스명을 불러올 수 있음
		System.out.println();
		
		Busan busan = new Busan();
		busan.data();
		busan.data1(500);
		busan.data1(5000000);
		busan.data1(-500);
	}
	
}
