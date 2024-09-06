package t11_interface.t01;
//implements는 인터페이스를 상속받는 다는 느낌
public class Seoul implements Test1  {

	@Override
	public void data() {	// 추상메소드 하나만 넘어옴
		System.out.println("이곳은 Seoul클래스의 data 메소드 입니다.");
	}

	@Override
	public void data1(int su) {}
	
}
