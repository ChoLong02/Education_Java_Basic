package chapter03;

public class Operator01 {
    public static void main(String[] arg) {
        int num1; // num1, num2 선언
        int num2; // int num1, num2, result; 로 써도 됨
        int result;
        num1 = 8;
        num2 = 5; // 초기화
        
        // 덧셈
        result = num1 + num2;
        System.out.println("덧셈: " + result);
        
        // 뺄셈
        result = num1 - num2;
        System.out.println("뺄셈: " + result);
        
        // 곱셈
        result = num1 * num2;
        System.out.println("(*): " + result);
        
        // 나눗셈(몫)
        result = num1 / num2;
        System.out.println("(/): " + result);
        
        // 나눗셈(나머지 : 홀짝계산에 자주 쓰임)
        result = num1 % num2;
    	System.out.println("나머지: " + result);
        
	}
}
