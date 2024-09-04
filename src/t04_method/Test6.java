package t04_method;

public class Test6 {
	int su; //필드는 초기값을 안주면 정수는 0
	//접근제한자
	public Test6() {}
	//필드 메소드 생성자
  //리턴타입 메소드이름 똑같은 이름 쓸 수 없음, 대소문자구별

	public void mod1() {
		System.out.println("이곳은 Test6클래스의 mod1 메소드 입니다");

		//mod2()메소드 호출
		mod2(su);
	}
	private void mod2(int su) {
		System.out.println("이곳은 Test6클래스의 mod2 메소드 입니다. su="+su);
		//this.su
	}

	String integerCheck(int su) {
		String check="0";
		if(su > 0) check = "양수";
		else if (su < 0) check = "음수";
		
		return check;
	}
	
	
}
