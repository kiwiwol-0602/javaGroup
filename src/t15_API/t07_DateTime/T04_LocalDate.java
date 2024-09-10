package t15_API.t07_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class T04_LocalDate {
	public static void main(String[] args) {
		//날짜 : LocalDate 객체
		LocalDate currenDate = LocalDate.now();
		System.out.println("오늘날짜 : " + currenDate);
		
		//날짜 지정 셋팅
		currenDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정날짜 : " + currenDate);
		
		//시스템 시간 : LocalTime
		LocalTime currenTime = LocalTime.now();
		System.out.println("현재시간 : " + currenTime);
		System.out.println("현재시간 : " + currenTime.toString().substring(0,8));
		
		//날짜,시간 : LocalDateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜/시간 : " + currentDateTime);
		System.out.println("현재 날짜 : " + currentDateTime.toString().substring(0,10));
		System.out.println("현재 시간 : " + currentDateTime.toString().substring(11,19));
		
		String[] strDatrTime = LocalDateTime.now().toString().split("T");		
		System.out.println("현재 날짜 : " + strDatrTime[0]);
		System.out.println("현재 시간 : " + strDatrTime[1].substring(0,strDatrTime[1].lastIndexOf(".")));
		System.out.println();
		
		//날짜 연산 : plusYears(), minusYears() 
		LocalDateTime res = currentDateTime.plusYears(1);
		System.out.println("오늘날짜 년도 +1 : " + res.toString().substring(0,4));

		res = currentDateTime.minusDays(7);
		System.out.println("오늘날짜 일 -7 : " + res.toString().substring(8,10));
		
		
		
	}
}
