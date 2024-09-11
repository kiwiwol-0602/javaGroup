package t16_Thread.t_synchronized;
//동기화를 목적으로 만드는건 일률적으러 가는거라 스레드를 사용할 필요가 없음 !?

//공유객체
class MyDate{
	int data = 10;
	
	public void plusMethod() {
		int mydata = data;
		try {	Thread.sleep(1000);	} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

//공유객체를 사용하는 스레드
class UseMyData extends Thread{
	MyDate myDate = new MyDate();
	
	@Override
	public void run() {
		myDate.plusMethod();
		System.out.println(getName() +"실행결과 : " + myDate.data);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Thread th1 = new UseMyData();
		th1.start();

		Thread th2 = new UseMyData();
		th2.start();

		Thread th3 = new UseMyData();
		th3.start();
		
	}
}
