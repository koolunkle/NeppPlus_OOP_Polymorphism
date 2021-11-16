package Codes.datas;

public class Tv {

	public boolean isTurnOn;
	public int channelNum;

	public void turnOnTv() {
		System.out.println("Tv가 켜집니다.");
		isTurnOn = true;
	}

	public void turnOffTv() {
		System.out.println("Tv가 꺼집니다.");
		isTurnOn = false;
	}

}
