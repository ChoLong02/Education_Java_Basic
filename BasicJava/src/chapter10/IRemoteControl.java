package chapter10;

//리모컨
public interface IRemoteControl {
  
	  // 인터페이스에서는 상수밖에 못오기 때문에 자바에서 자동으로  public static final 붙여줌.
	  // 상수에서는 상수명을 대문자로 써야하기 때문에 합성어는  언더바로 붙여준다.(카멜표기법 사용이 불가하기 때문)
	  public static final int MAX_VOLUME = 10;
	  int MIN_VOLUME = 0;
	  
	  // 추상메서드(메서드 앞에 아무것도 없으면 추상으로 인식)
	  // 인터페이스에서는 상수, 추상메서드 밖에 못오기 때문
	  public abstract void turnOn();
	  void turnOff();
	  
	  void setVolume(int volume);
  
}
