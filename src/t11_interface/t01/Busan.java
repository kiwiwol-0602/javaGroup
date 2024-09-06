package t11_interface.t01;

public class Busan implements Test1{

	@Override
	public void data() {
		System.out.println("이곳은 Busan클래스의 data 메소드 입니다.");
		
	}

	/*@Override // Test1에서 가져온 것이 아닌 새로 생성한게 되버림.
	public void data1() {
		System.out.println("이곳은 Busan클래스의 data 메소드 입니다.");
	}*/

	@Override
	public void data1(int su) {
//		System.out.println("이곳은 Busan클래스의 data 메소드 입니다.");
		int sori=0;
		if(su > MAX) sori = MAX;
		else if(su < MIN) sori = MIN;
		System.out.println("sori : " + sori);
	}

}
