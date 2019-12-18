package chapter14;

public class Exception01 {
    
    // 예외처리방법 4가지(1,3번 중요)
    // 1. try~catch(★★★★★) : try~catch~finally를 통해서  예외 처리
    // 2. throw : 의도적으로 예외를 강제 발생(예외처리 테스트할 때)
    // 3. throws(★★★) : 예외전가(예외를 처리하지 않고 다음으로  넘김)
    // 4. 사용자 정의 예외 : 사용자가 Exception 클래스를 상속받아  개인적으로 만드는 예외
    
    public static void main(String[] args) {
          try {
               // 실행중 예외가 발생할 것 같은 부분
               // 예외가 발생하지 않으면 finally로 바로 간다.
               // 실행문
          } catch (Exception e) {
               // 직접적으로 예외 처리(모든 Exception 통합)
               // 예외 처리 코드 등
               e.printStackTrace(); // 주로 사용함.
          } finally {
               // 무조건 실행
               // 자원 반납 코드
          }
    }
}
