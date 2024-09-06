package t11_interface.t04;

public class Actor implements FireMan, PoliceMan, Chef{

	@Override
	public void pizza() {
		System.out.println("피자를 만들 수 있습니다");
	}

	@Override
	public void pasta() {
		System.out.println("파스타를 만들 수 있습니다");
		
	}

	@Override
	public void catching() {
		System.out.println("범인을 잡을 수 있습니다");
	}

	@Override
	public void search() {
		System.out.println("물건을 찾을 수 있습니다");
		
	}

	@Override
	public void fire() {
		System.out.println("불을 끌 수 있습니다");
	}

	@Override
	public void rescue() {
		System.out.println("인명구조를 할 수 있습니다");
	}
	
	
	

}
