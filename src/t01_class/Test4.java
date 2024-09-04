package t01_class;

public class Test4 {
	public static void main(String[] args) {
		Test1 t11 = new Test1(); //hip에 저장됨
		Test1 t12 = new Test1(); //hip에 저장됨
		
		
		if(t11 == t12) {
			System.out.println("t11객체와 t12객체는 같은 객체 입니다.");
		}
		else {
			System.out.println("t11객체와 t12객체는 서로 다른 객체 입니다.");			
		}
		
		Test1 t13;
		t13 = t11;
		if(t11 == t13) {
			System.out.println("t11객체와 t13객체는 같은 객체 입니다.");
		}
		else {
			System.out.println("t11객체와 t13객체는 서로 다른 객체 입니다.");			
		}
		if(t12 == t13) {
			System.out.println("t12객체와 t13객체는 같은 객체 입니다.");
		}
		else {
			System.out.println("t12객체와 t13객체는 서로 다른 객체 입니다.");			
		}
		
//		Test1 t14 = "mbc";//초기값 안주면 오류
		Test1 t14 = null;//초기값 안주면 오류
		if(t13 == t14) {
			System.out.println("t13객체와 t14객체는 같은 객체 입니다.");
		}
		else {
			System.out.println("t13객체와 t14객체는 서로 다른 객체 입니다.");			
		}
		if(t14 == null) {
			System.out.println("t14객체의 초기값은 null 입니다.");
		}
		else {
			System.out.println("t14객체의 초기값은 null 아닙니다.");			
		}
		/*
		if(t14.equals("null")) {
		if(t14.equals(null)){
			System.out.println("t14객체의 초기값은 null 입니다.");
		}
		else {
			System.out.println("t14객체의 초기값은 null 아닙니다.");			
		}
		*/
		
	}
}
