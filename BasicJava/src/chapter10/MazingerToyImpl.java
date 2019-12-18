package chapter10;

public class MazingerToyImpl implements IMissile, IMoveArmLeg{
	
	public MazingerToyImpl() {
		System.out.println("마징가입니다.");
		canMissile();
		canMoveArmLeg();
		System.out.println("========================");
	}
	
	@Override
	public void canMoveArmLeg() {
		System.out.println("마징가 팔다리 움직이기!!!");
	}
	@Override
	public void canMissile() {
		System.out.println("울트라미사일발사!!!");
	}

}
