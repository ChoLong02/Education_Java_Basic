package chapter08;

// 자식 클래스
public class Child extends Parent{
	
	// @은 JAVA가 실행할 때 표지판
	@Override
	public int sum(int a, int b) {
		super.sum(2, 3); // 부모의 sum() 메서드
		System.out.println("합: " + (a+b));
		return super.sum(a, b);
	}
	
	// 메서드 재정의(오버라이딩)
	// : 부모클래스의 메서드를 그대로 사용하는게 아니고
	//   내 입맛에 맞게 바꾸어 사용하는 것!
	
	
}
