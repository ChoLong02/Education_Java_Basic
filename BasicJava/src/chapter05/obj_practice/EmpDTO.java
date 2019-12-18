package chapter05.obj_practice;

public class EmpDTO {
    
    int empno = 1001;
    String name = "박선미";
    private int sal = 3000;
    String deptname = "개발부";
    String phone = "010-8850-7667";
    
    // getter() 값을 보여주는 역할
    public int getSal() {
          return sal; // return : output, 돌아올 때 들고오는 짐.
    }
    
    // setter() 값을 넣는 역할
    public void setSal(int sal) { // int sal : 고향갈때 들고가는  짐.
          this.sal = sal; // -> 전역변수(sal) = 지역변수(sal)
    }
}