package t05_static;

public class Test2Run {
	public static void main(String[] args) {
		Test2 t2 = new Test2("222-555");
		System.out.println("nation : " + t2.nation);
		
//		t2.nation = "USA";
//		System.out.println("nation : " + t2.nation);
		
		System.out.println("jumin : " + t2.jumin);
//		t2.jumin = "123-456"; // 값 변경 할 수 없어서 에러
		System.out.println("jumin : " + t2.jumin);
	}
}
