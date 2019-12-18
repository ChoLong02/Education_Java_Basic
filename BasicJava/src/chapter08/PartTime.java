package chapter08;

public class PartTime extends Employee{ // 자바에서는 다중상속x,  인터페이스는 다중구현
    private String shift;  // 교대
    public String getShift() {
          return shift;
    }
    public void setShift(String shift) {
          this.shift = shift;
    }
    @Override
    public void work() { // 부모클래스 가지말고 자식클래스에 있는  work()를 실행
          // super.work(); -> 부모클래스에 있는 work()매서드를  실행해라
          System.out.println(getPosition() + "입니다.  파트타임으로 일을 합니다.");
    }
}
