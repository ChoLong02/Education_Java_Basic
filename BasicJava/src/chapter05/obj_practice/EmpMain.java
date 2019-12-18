package chapter05.obj_practice;

public class EmpMain {
    public static void main(String[] args) {
          EmpDTO eDto = new EmpDTO();
          eDto.setSal(5000); // ( )안에 매개변수가 들어간다,  고향갈 때 들고가는 짐 = 매개변수
          System.out.println("사원명 : " + eDto.name);
          System.out.println("연봉 : " + eDto.getSal());
          // getter,setter : 찾을 수 없는 sal을 쓸 수 있게 해줌      
    }
}