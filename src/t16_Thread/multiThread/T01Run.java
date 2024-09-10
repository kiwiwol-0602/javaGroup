package t16_Thread.multiThread;

public class T01Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스명 : T01Run");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
		System.out.println();
		
		Thread th1 = new T01();
		th1.start(); //스레드는 1번밖에 수행을 못함
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("----------------------------------------");
		System.out.println("현재 클래스명 : T01Run");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println("----------------------------------------");
	}
}

class T01 extends Thread{
	@Override
	public void run() {
		System.out.println("1.현재 클래스명 : T01");
		System.out.println("1.현재 실행중인 스레드명? "+ Thread.currentThread().getName());
	
//		for(long i=0; i<100000000000L; i++)	{}
		for(int i=1; i<=5; i++) {
			System.out.println("i = "+i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
		
		System.out.println("2.현재 클래스명 : T01");
		System.out.println("2.현재 실행중인 스레드명? "+ Thread.currentThread().getName());
		System.out.println("2."+Thread.currentThread().getName()+" 스레드가 종료됩니다.");
	}
}