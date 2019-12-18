package chapter05.obj_practice;

public class GugudanMain {
    public static void main(String[] args) {
          System.out.println("1111111");
          GugudanPlay gp = new GugudanPlay(); // GugudanPlay  클래스로 간다
          // 객체자료형 객체참조변수 = new(객체생성연산자)  생성자메소드();
          // 메소드 종류 : 기본, 생성자 (생성자 메소드는 대문자로 시작)
         
          gp.guguCalc(); // 분기문 : 호출해서 사용함(gp.은 쓴다는  뜻)
          System.out.println("2222222");
    }
}
