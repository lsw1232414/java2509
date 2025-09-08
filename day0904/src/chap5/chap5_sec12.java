package chap5;

import java.util.Calendar;

public class chap5_sec12 {
	public static void main(String[] args) {
		Week today = null;
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1:  today = Week.SUNDAY ;      break;
			case 2:  today = Week.MONDAY;       break;
			case 3:  today = Week.TUESDAY;      break;
			case 4:  today = Week.WEDNESDAY; 	break;
			case 5:  today = Week.THURSDAY;   	break;
			case 6:  today = Week.FRIDAY;       break;				
			case 7:  today = Week.SATURDAY;   	break;		
		}
		
		//열거 타입 변수를 사용
		 switch (today) {
         case SUNDAY:
             System.out.println("일요일");
             break;
         case MONDAY:
             System.out.println("월요일");
             break;
         case TUESDAY:
             System.out.println("화요일");
             break;
         case WEDNESDAY:
             System.out.println("수요일");
             break;
         case THURSDAY:
             System.out.println("목요일");
             break;
         case FRIDAY:
             System.out.println("금요일");
             break;
         case SATURDAY:
             System.out.println("토요일");
             break;
     }
	}
}
