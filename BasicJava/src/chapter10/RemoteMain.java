package chapter10;

public class RemoteMain {
    public static void main(String[] args) {
          
          TelevisionImpl rc = new TelevisionImpl();
          rc.turnOn();
          rc.search("tvN");
          rc.setVolume(8);
          rc.turnOff();
    }
}
