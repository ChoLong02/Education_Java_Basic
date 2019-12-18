package chapter05;

public class Con01 {
    // 생성자
    public Con01() {
          
          // 같은 class 내부에 있는 메서드는 객체생성 없이 바로  참조가능
          printStr();
    }
    
    // 메서드
    public void printStr() {
          
          System.out.println("Con01 일반메서드 호출");
    }
}
