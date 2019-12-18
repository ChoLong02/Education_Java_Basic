package chapter03;

public class Operator05 {
	public static void main(String[] args) {
        //증감 연산자
        //++x, x++, --x, x--
        int num1 = 7;
        int num2 = 7;
        int result1;
        int result2;
        
        result1 = --num1 + 4; // --가 앞에 있으면 1을 빼고 연산
        result2 = num2-- + 4; // --가 뒤에 있으면 연산 하고 1을 뺌, 카운터 셀 때 자주 씀
        System.out.println("전위 감소연산자 결과: " + result1 + ", 변수값: " + num1);
        System.out.println("후위 감소연산자 결과: " + result2 + ", 변수값: " + num2);
	}
}
