package chapter02;

public class Variable03 {
	public static void main(String[] args) {
        // 문자를 저장하는 자료형
        // char
        char ch1 = 'A'; // 문자 하나는 '' 사용, 단어는 상관 없음
        // char는 문자를 유니코드로 바꿈
        char ch2 = '헐';
        char ch3 = '확';
        char ch4 = 54736; // '헐'의 유니코드
        char ch5 = 54869; // '확'의 유니코드
        
        System.out.println(ch1);
        System.out.println(ch2 + " = " + ch4);
        System.out.println(ch3 + " = " + ch5);
        
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println(b1);
        System.out.println(b2);
	}
}
