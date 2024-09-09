package t15_API.t02_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot =0;
		
		for(i=1; i <=1000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000 이상일때의 i값은? "+i);
				//break;
				//return; // 밑에를 수행하지 않고 종료(돌아오는 개념)
				System.exit(0);//메인을 강제종료, 시스템객체
			}
		}
		System.out.println("tot: "+tot);
	}
}
