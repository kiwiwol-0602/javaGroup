package t10_abstract;

public class Dog extends Animal{
	private String talk = "멍멍";
	
	public Dog(String taik) {
		this.talk = taik;
	}
	
	void cry() {
		
	}

	@Override
	public void sound() {
		System.out.println("강아지 울음소리는 "+talk+"~~");
	}
	
	public void work() {
//		sound();//추상메소드라 실제 실행 내용이 없음
		move();
		moving();
		
	}
//	public void sound() { //구현객체는 public을 붙여줘야함
		
	}
