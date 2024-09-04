package t09_Exercise;
// 현실 세계의 회원을 Member 클래스로 모델링 하려고 합니다.
// 회원의 데이터로는 이름 아이디 페스워드 나이가 있습니다.
// 이 데이터들이 가지는 Member 클래스를 선언해보세요
//이름 : name, 문자열
//아이디 : id, 문자열
//패스워드 : password, 문자열
//나이 : age, 정수

public class Member {//13
	public String name;
	public String id;
	public String password;
	public int age;
	
	public Member (String name, String id) {//14
		this.name = name;
		this.id = id;
	}
}
