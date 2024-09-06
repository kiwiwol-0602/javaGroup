package t14_exception.t01;

public class T1_ClassNotFound {
	public static void main(String[] args) {
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {
		
		try {
			//클래스를 찾는 클래스: Class.forName("java.lang.Object");
			Class.forName("java.lang.Object2");
			System.out.println("찾는 파일이 존재합니다.");
		} catch (ClassNotFoundException e) { //이 클래스가 있으면 try로 가고 없으면 catch문으로 감
		//} catch (Exception e) {
			//System.out.println("찾는 파일이 없습니다.");
			//e.printStackTrace();
			//System.out.println(e.getMessage()); //오류문구를 간결하게 요약해서 알려줌
			System.out.println("파일검색실패 : " + e.getMessage());
		} finally {
			System.out.println("작업끝");
		}
			
		
	}
}
