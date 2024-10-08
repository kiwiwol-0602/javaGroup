package t16_Thread.t_synchronized;

// 공유객체
class MyData2 {
	int data = 10;
	
	// 스레드 메소드 동기화(synchronized)
	public synchronized void plusMethod() {
		int mydata = data;
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		data = mydata + 1;
	}
}
 
// 공유객체를 사용하는 스레드
class UseMyData2 extends Thread {
	MyData2 myData2;
	
	public UseMyData2(MyData2 myData2) {
		this.myData2 = myData2;
	}
	
	@Override
	public void run() {
		myData2.plusMethod();
		System.out.println(getName() + "실행결과 : " + myData2.data);
	}
}
 
public class Test2 {
	public static void main(String[] args) { //메인이 자료를 부른다
		MyData2 myData2 = new MyData2();
		
		Thread th1 = new UseMyData2(myData2);
		th1.start();
		
		Thread th2 = new UseMyData2(myData2);
		th2.start();
		
		Thread th3 = new UseMyData2(myData2);
		th3.start();
	}
}
