package t05_static;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("t1 : " + t1.su); //hip
		t1.add(50, 150);
		
		System.out.println("su : " + Test1.su); //main
		//공통영역에 저장됬다는건 자주 사용되는 것임
		Test1.add(100,200);
	}
}
