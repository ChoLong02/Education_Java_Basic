package chapter08;

public class Employee {
    
    private String name;
    private String position;
    
    // getter() & setter() > private를 만들었으면 같이 만들어  주어야한다.
    public String getName() {
          return name;
    }
    public void setName(String name) {
          this.name = name;
    }
    public String getPosition() {
          return position;
    }
    public void setPosition(String position) {
          this.position = position;
    }
    
    // 출근 메서드
    public void clockIn() {
          System.out.println(this.name + "출근했습니다");
    }
    // 퇴근 메서드
    public void clockOut() {
          System.out.println(this.name + "퇴근했습니다.");
    }
    
    // 근무 메서드
    public void work() {
          System.out.println(this.position + "입니다. 일을 합니다.");
    }
}

