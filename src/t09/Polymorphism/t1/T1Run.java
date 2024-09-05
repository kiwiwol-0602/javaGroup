package t09.Polymorphism.t1;

// 자동타입변환		
public class T1Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		
		Bb bb = new Bb();
		System.out.println("su : " + bb.su);
		System.out.println();
//		Ff ff = bb;
		Aa a1 = bb; // b가 a로 바뀜
		System.out.println("su : " + a1.su); //10으로 출력
		System.out.println();
		
		Cc cc = new Cc();
		System.out.println("su : " + cc.su);
		System.out.println();
		
		Aa a2 = new Cc();
		System.out.println("su : " + a2.su); //10으로 출력
		System.out.println();
		
		Dd dd = new Dd();
		System.out.println("su : " + dd.su);
		System.out.println();
		
		Bb b1 = new Dd();
		System.out.println("su : " + b1.su);
		System.out.println();
		
		Aa a3 = new Dd();
		System.out.println("su : " + a3.su);
		System.out.println();
		
//		Bb b2 = (B) new Aa();
		
	}
}
