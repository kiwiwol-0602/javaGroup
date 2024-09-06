package t14_exception.t01;

public class T7_NumberFormat {
	public static void main(String[] args) {
		String strNo = "1234";
		String strNo2 = "1234c";
			
		int num =	Integer.parseInt(strNo);//문자형식으로 된 숫자를 숫자로 변경해주는 명령어
		System.out.println(num + 1000);
		
		try {
			num =	Integer.parseInt(strNo2);//문자형식으로 된 숫자를 숫자로 변경해주는 명령어
			System.out.println(num + 1000);
			System.out.println("정상처리");
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류 : " + e.getMessage());
		} finally {
			System.out.println("작업종료");
		}
	}
}
