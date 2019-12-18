package chapter10;

//Impl은 주로 대문자로 시작하게 만든다.
//인터페이스를 구현받는 구현체
public class TelevisionImpl implements IRemoteControl,  ISearchable{
	  
	  private int volume;
	  @Override
	  public void turnOn() {
	        System.out.println("TV를 켭니다.");
	  }
	  @Override
	  public void turnOff() {
	        System.out.println("TV를 끕니다.");
	  }
	  @Override
	  public void setVolume(int volume) {
	        
	        if(volume > IRemoteControl.MAX_VOLUME) {
	             this.volume = IRemoteControl.MAX_VOLUME;
	        } else if(volume < IRemoteControl.MIN_VOLUME) {
	             this.volume = IRemoteControl.MIN_VOLUME;
	        } else {
	             this.volume = volume;
	        }
	        
	        System.out.println("현재 TV 볼륨은 " + this.volume +  "입니다.");
	  }
	  @Override
	  public void search(String url) {
	        System.out.println(url + "채널을 변경합니다.");
	  }
}
