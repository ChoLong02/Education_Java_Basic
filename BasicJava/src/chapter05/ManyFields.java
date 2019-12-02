package chapter05;

// JAVA에서 사용하는 다양한 변수들!!
public class ManyFields {
	int all; // 필드(멤버변수), 전역변수
	
	// static(정적)변수, 클래스변수, 필드(멤버변수), 전역변수
	static String stt; 

	public void sum(int a, int b) { // 매개변수, 지역변수
		int localNum = 30; // 지역변수
	}   
	
	public void test() {
		ManyFields mf = new ManyFields();
		mf.all = 5; // 인스턴스변수
	}
}
