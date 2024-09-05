package t10_abstract.t1;

public class Samsung extends Phone {

	public Samsung(String name) {
		super(name + "(삼성)");
	}

	@Override
	public void function() {
		System.out.println(getName() + "폰은 삼성페이 기능이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName() + "폰은 전화벨소리가 띠리리링 입니다.");
	}
	
	@Override
	public void functionSamsaung() {
		System.out.println("이번에 새로 추가된 기능은 'AI통역'이 있습니다.");
	}
	
	
}
