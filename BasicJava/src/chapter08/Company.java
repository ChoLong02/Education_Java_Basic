package chapter08;

public class Company {
    public static void main(String[] args) {
          // 사원클래스 객체 생성
          Employee emp = new Employee();
          PartTime pt = new PartTime();
          
          // 사원 클래스의 position에 일반사원 입력
          emp.setPosition("일반사원");
          // private 아닐때는 emp.position = "일반사원"; 하면 됨
          pt.setPosition("알바생");
          
          // 사원 클래스 work() 메서드 실행
          emp.work();
          pt.work();
    }
}
