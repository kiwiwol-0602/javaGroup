package t08_inheritance;

public class T05_C extends T05_P {

	@Override//사용안해도 에러가 나진 않지만 내가 실수한거 찾아주는 역활
	void areaCricle(int r) {
		//오버라이드방법 1.복사 2.소스에서 3.이름으로
		super.areaCricle(r);
	}

	@Override
	void div(int su1, int su2) {
		//super.div(su1, su2);//자식메소드 사용하지 않고, 부모메소드 호출
		double res = (double) su1 / su2;
		System.out.println("res : " + res);
	}
	
//	@Override
//	void areaCricle(int r) {
//		
//		//super.areaCricle(r);
//	}
//	
	
//	//오버라이드 어노테이션
//	@Override
//	void areaCricle(int r) {
//		
//	}
	
//	void areaCricle(int rr) {
//		double area = rr*rr*pi;
//		System.out.println("원넓이 : "+area); // 오버라이드임
//	}
//	void areaCricle(double r) { //선언부가 달라서 오버라이드가 아님
//		double area = r*r*pi;
//		System.out.println("원넓이 : "+area);
//	}
	
//	void areaCricle(int r) { //재정의 하는 부분에 내용이 없어도 오버라이드
//  //오버라이드 한것은 무조건 자식 값을 가져옴		
//	}
	//void areaCricle(int r) 메소드 선언부
	
//	void areaCricle(int r) {
//		double area = r*r*pi; //오버라이드: 부모메소드를 가져와서 재정의(무조건 메소드)
//		System.out.println("원넓이 : "+area);
//	}
//	//고치던 안고치던 가지고 오기만 해도 오버라이드
}
