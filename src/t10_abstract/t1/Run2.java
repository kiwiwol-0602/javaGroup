package t10_abstract.t1;

public class Run2 {
	public static void main(String[] args) {
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsaung();
		samsungPhone.powerOff();
		System.out.println();
		
		Phone lgPhone = new Lg("김말숙");
		lgPhone.powerOn();
		lgPhone.sound();
		lgPhone.function();
		lgPhone.functionSamsaung();
		lgPhone.powerOff();
		System.out.println();
	}
}
