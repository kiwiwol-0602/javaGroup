package t09_Polymorphism.t1;

public class T2Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
//		Cc a2 = new Aa();
//		Cc cc = a1; //처음부터 부모객체가 자식객체로 타입변환될 수 없다.
		// 부모객체가 자식객체로 타입변환을 하기위해서는 
		//무조건 자식객체가 부모타입으로 변환했을때만 가능하다. (강제 Casting)
		
		Bb bb = new Bb();
		System.out.println("su1 : " + bb.su); //20 
		Aa a1 = bb;
		System.out.println("su1-1 : " + a1.su); //10 b->a
		System.out.println();
		Bb b1 = (Bb)a1;
		System.out.println("su1-2 : " + b1.su); //20 a->b
		System.out.println();

		Aa a2 = new Dd();
		System.out.println("su2 : " + a2.su); //10 d->a
		System.out.println();
		Dd d1 = (Dd)a2;
		System.out.println("su2-1 : " + d1.su); //40 a->d
		System.out.println();
		
		Bb b2 = (Bb)a2;
		System.out.println("su3 : " + b2.su); //20 d가된 a->b
		b2.modAa();
		System.out.println();
		//Cc객체가 Aa로 타입변환된 적이 없기에, a2객체는 Cc객체로 타입변환불가
		//(컴파일상에서는 에러가 발생하지 않는다 -> 실행오류)
//		Cc c1 = (Cc)a2;
//		System.out.println("su : " + c1.su); //20 b가된 a->c 는 불가
//		System.out.println();
		
		//Override 적용시, 
		//같은 함수가 있으면 자식 끌래스에 있는 함수 사용 ,아니면 부모 클래스 함수사용
		Aa a3 = new Bb(); // Up Casting
		System.out.println("4.su : " + a3.su);
		a3.modAa();
		System.out.println();
		
		Bb b3 = (Bb) a3; // Down Casting (강제)
		System.out.println("5.su : " + b3.su);
		b3.modAa();
		
		
	
	}
}
