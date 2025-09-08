package chap6;

public class chap6_sec06_1 {
	public static void main(String[] args) {
		//Car 객체 생성
		chap6_sec06 myCar = new chap6_sec06();
		
		//Car 객체의 필드 값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}
}

