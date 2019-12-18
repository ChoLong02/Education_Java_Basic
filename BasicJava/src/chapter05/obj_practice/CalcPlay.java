package chapter05.obj_practice;

public class CalcPlay {
    int total = 0;
    
    public int sumCalc(int num1, int num2) { // return; 으로  값이 없는 return을 쓰면 중괄호가 끝나는 역할이랑 같음
          total = num1 + num2;
          return total;
    }
    public int subCalc(int num1, int num2, int temp) {
          total = num1 - num2;
          return total;
    }
    public int multiCalc(int num1, int num2) {
          total = num1 * num2;
          return total;
    }
    public int divCalc(int num1, int num2) {
          total = num1 / num2;
          return total;
    }
}
