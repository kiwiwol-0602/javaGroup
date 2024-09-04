package t05_static;

//import t04_method.Test5;
//import t04_method.Test6;
import t04_method.*;//* 와일드카드(저 패키지에 있는 모든 파일 참조)

public class Test4Run {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.mod1();
		
//		new t04_method.Test6();
		new Test6();
		new Test5(5);
		new t04_method.Test4();
		
	}
}
