package chapter03;

public class Operator04 {
    public static void main(String[] args) {
        
        // 논리 연산자
        // AND(&&) 두개짜리는 앞에 먼저 보고 False면 뒤에는 계산 안 함
        // True && True => True
        // True && False => False
        // False && True => False
        // False && False => False
        // OR(||, |)는  False && False 빼고 다 True
        
        // AND는 둘다 모두 True일 때만 True
        // 나머지는 전부 False
        // OR는 둘다 모두 False일 때만 False
        // 나머지는 전부 True
        
        boolean b1 = false;
        boolean b2 = false;
        
        if(b1 && b2) {
             System.out.println("True");
        } else {
             System.out.println("False");
        }
	}
}
