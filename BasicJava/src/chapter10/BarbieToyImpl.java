package chapter10;

public class BarbieToyImpl implements ILight, IMissile,  IMoveArmLeg{
    
    public BarbieToyImpl() {
          System.out.println("전투소녀 바비");
          canLight();
          canMissile();
          canMoveArmLeg();
          System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
          
    }
    @Override
    public void canMoveArmLeg() {
          System.out.println("팔다리움직입니다.");
    }
    @Override
    public void canMissile() {
          System.out.println("미사일발사가능합니다.");
    }
    @Override
    public void canLight() {
          System.out.println("빛이나옵니다.");
    }
}
