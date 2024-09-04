package t07_Singleton;

public class TestRun {
	public static void main(String[] args) {
		//new Singleton();
		//Singleton.singleton
		
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		Singleton sbs = Singleton.getInstance();
		//mbc 라는 객체가 생성되어 있는 걸 가져다 씀
		
		if(mbc==kbs) {
			System.out.println("mbc와 kbs는 서로 같은 객체를 가리키고 있습니다.");
		}
		else {
			System.out.println("mbc와 kbs는 서로 다른 객체를 가리키고 있습니다.");
		}
		if(mbc==sbs) {
			System.out.println("mbc와 sbs는 서로 같은 객체를 가리키고 있습니다.");
		}
		else {
			System.out.println("mbc와 sbs는 서로 다른 객체를 가리키고 있습니다.");
		}
	}
}
