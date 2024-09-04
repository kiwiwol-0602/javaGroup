package t50_Exercise;

import java.util.Scanner;

/*
 '성명(name), 나이(age), 지역(address), 성별(gender)'를 입력받아서 고객 정보를 저장 출력 하고자 한다.
 나이는 20세 이상 90세 미만 사람만이 가입할 수 있고,
 주소 입력 시 외국인은 0으로 입력한다.
 성별은 남자가 1,3 이고 여자는 2,4로 입력처리한 후 저장은 남자/여자로 저장처리한다.
 저장된 자료를 출력시켜 볼 수 있게 처리한다.
 */
public class T2Run {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String name, address, gender;
	int age, sex;
	
	System.out.print("성명을 입력하세요? ");
	name = sc.next();
	System.out.print("나이을 입력하세요? ");
	age = sc.nextInt();
	System.out.print("주소을 입력하세요?(외국인은 0) ");
	address = sc.next();
	System.out.print("성별을 입력하세요?(남자는 1,3으로, 여자는 2,4로 입력하시오?) ");
	sex = sc.nextInt();
	
	T2VO vo = new T2VO();
	vo.setName(name);
	vo.setAddress(address);
	while(true) {
		boolean ageCheck = vo.setAge(age);
		if(!ageCheck) {
			System.out.print("나이을 입력하세요? ");
			age = sc.nextInt();
		}
		else break;
	}
	vo.setGender(sex);
	
	T2Service service = new T2Service();
	//service.t2Print(name,age,address,sex);
	service.t2Print(vo);
	System.out.println("작업끝");
	
	sc.close();
 }
}
