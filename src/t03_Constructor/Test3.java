package t03_Constructor;

public class Test3 {
 // 기본생성자
	Test3() {}

	int atom1 = 30;

//	public Test3() {
//		System.out.println("atom1 : " + atom1);
//	}
//불러오는 방식
	public Test3(int atom1) { //사용자 정의 생성자, 생성자 오버로딩
		this. atom1 = atom1; // 숫자를 넣은 얘를 불러옴
		System.out.println("atom1 : " + atom1);
		System.out.println("this.atom1 : " + this.atom1);

		this.atom1 += atom1;
		System.out.println("this.atom1 : " + this.atom1);
		
	} // 500을 넣어줌
//	int atom1 = 30;
	
	
	int atom2 = 0;
	double atom3;
	
	Test3(double atom3){
		this.atom3 = atom3;
		System.out.println("this.atom3 : " + this.atom3);
	}
	
	
}
