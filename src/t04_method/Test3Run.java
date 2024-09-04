package t04_method;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t31 = new Test3(); //디폴트 생성자

		t31.su = 10; //필드를 통해 주입
		t31.mod2();

		t31.mod1(20); // 메소드를 통해 주입
		t31.mod2();
	}
}
