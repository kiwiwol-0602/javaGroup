package t08_inheritance;

import t08_inheritance.mbc.T111;

public class T05_P extends T111{ //퍼블릭 + 임퐅트..
	double pi= 3.14;
	
	void areaCricle(int r) {
		double area = r*r*pi;
		System.out.println("원넓이 : "+area);
	}
	//final void div(int su1, int su2) { // 메소드명 앞에 final 붙히면 오버라이드 불가이다.
	void div(int su1, int su2) {
		int res = su1/su2;
		System.out.println("res : " + res);
	}
	
}
