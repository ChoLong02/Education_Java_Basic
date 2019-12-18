package chapter09;

//추상부모클래스
public abstract class AParent {
	  
	  // 일반메서드
	  public void printSum(){
	        System.out.println("덧셈을 출력한다.");
	  }
	  
	  // 추상메서드
	  public abstract int totalSum(int x, int y);
  
}
