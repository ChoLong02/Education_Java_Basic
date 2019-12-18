package chapter09;

public class AMain {
    public static void main(String[] args) {
          // 생성자가 있더라도 추상클래스 단독으로 객체생성 불가
          // AParent ap = new AParent();
          
          // 객체생성(1번밖에 못쓴다.)
          Child ch = new Child(10, 5);
          
          // 인스턴스 사용(쓰고싶을 때 계속 사용)
          int num = ch.totalSum(7, 5);
          System.out.println("return : " + num);
    }
}
