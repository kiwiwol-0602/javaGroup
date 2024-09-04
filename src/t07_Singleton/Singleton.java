package t07_Singleton;

public class Singleton {
	//2. 정적필드(자신의 객체타입)를 선언하고, 초기값으로 객체를 생성시킨다.
	private static Singleton singleton = new Singleton();//필드 불가하게
	
	//1. 객체를 외부에서 생성하지 못하도록 생성자앞에 접근제한자로 private 붙여준다.
	private Singleton() {} // 불가하게
	
	//3. 외부에서 호출하여 사용할 수 있는 정적메소드(Getter)를 만든다.
	static Singleton getInstance() { //instance 복제품
		return singleton;
	}
}
// 생성된 객체는 힙에 가져다 두는데 걔를 불러오는 이름은 메소드(static)에 둠