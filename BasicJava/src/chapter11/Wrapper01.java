package chapter11;

public class Wrapper01 {
	public static void main(String[] args) {
	     String num = "27";
	     // 문자열 -> 정수형
	     int num2 = Integer.parseInt(num); // String 타입 num을  int타입으로 바꿔줌 -> num2라는 변수에 넣어줌
	     // Open API(어플리케이션인터페이스)에서 자료를 가져와 변환할  때를 파싱(parsing)이라고 한다.
	     System.out.println("문자열->정수형 : " + (num2 + 3)); //  문자열+정수형은 문자열로 바뀌기 때문에 뒤에 괄호를 써야한다.
	     // 정수형 -> 문자열
	     String ft = String.valueOf(num2); // int 타입 num2를  String타입으로 바꿔줌 -> ft이라는 변수에 넣어줌
	     
	     System.out.println(ft + 3);
	}
}
