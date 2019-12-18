package chapter05.obj_practice;

public class GadgetATM {
    
    // 입력 : input  : Create (CRUD)
    // 수정 : update : U
    // 삭제 : delete : D
    // 조회 : select : Read
    
    public int inputMoney(int plus, int money) {
          money = money + plus;
          return money;
    }
    public int deleteMoney(int minus, int money) {
          money = money - minus;
          return money;
    }
    public void selectMoney(int money) {
          System.out.println("   ♥ 잔고 > " + money);
    }
}
