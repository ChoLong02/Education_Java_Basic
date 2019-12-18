package chapter09;

//자식클래스 <- 추상부모클래스 상속, 반드시 오버라이딩 해야함
public class Child extends AParent{
	  int total;
	  
	  // 기본생성자
	  public Child() {
	        super();
	  }
	  
	  // 첫글자 대문자, 일반생성자, return 사용X
	  public Child(int x, int y) {
	        super();
	        System.out.println(">>>>>>> 생성자");
	        total = x + y;
	        System.out.println("총합 : " + total);
	  }
	  
	  // 일반메서드, return 사용해서 메인클래스에서 return값 사용가능
	  @Override
	  public int totalSum(int x, int y) {
	        System.out.println(">>>>>>> 일반메서드");
	        total = x + y;
	        System.out.println("총합 : " + total);
	        return total;
	  }
  
}
