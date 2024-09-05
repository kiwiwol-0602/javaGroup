package t09.Polymorphism.t2;
//instanceof: 과거에 부모객체로 타입변화닝 되었었는지를 알아보는 연산자(true/false)
public class Run {
	public static void main(String[] args) {
		Aa aa = new Bb();
		
		//Bb bb= (Bb)aa; // (O)
		
		//Cc cc = (Cc) aa; // (X)
		//Down Casting을 하기 위해서는 반드시 Up Casting이 선행되어있어야한다.
		if(aa instanceof Bb) {
			Bb bb = (Bb)aa;
			System.out.println("Down Casting 성공 ~~");
		}
		else {
			System.out.println("Down Casting 실패 ~~");			
		}
		if(aa instanceof Cc) {
			Cc cc = (Cc)aa;
			System.out.println("Down Casting 성공 ~~");
		}
		else {
			System.out.println("Down Casting 실패 ~~");		
		}
	}
}
	
