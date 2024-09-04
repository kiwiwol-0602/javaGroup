package t03_Constructor;

public class Test2 {
 // 기본생성자
	Test2() {}

	Test2(int su1){}
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(double su1, int su2) {}
// 타입이 다르거나, 매게변수의 갯수가 다르거나, 순서가 다르거나
// : 생성자 오버로딩
}
