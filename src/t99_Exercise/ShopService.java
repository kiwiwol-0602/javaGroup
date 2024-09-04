package t99_Exercise;

public class ShopService {
	//2. 정적필드(자신의 객체타입)를 선언하고, 
	//초기값으로 객체를 생성시킨다.
	private static ShopService singleton = new ShopService();
	//필드 불가하게
	
	//1. 객체를 외부에서 생성하지 못하도록 생성자앞에 
	//접근제한자로 private 붙여준다.
	private ShopService() {} // 불가하게
	
	//3. 외부에서 호출하여 사용할 수 있는 정적메소드(Getter)를 만든다.
	static ShopService getInstance() { //instance 복제품
		return singleton;
	}
}