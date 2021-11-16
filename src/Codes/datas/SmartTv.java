package Codes.datas;

public class SmartTv extends Tv {

	@Override
	public void turnOnTv() {

//		셋톱박스를 키고 -> TV 본체를 켠다.

		System.out.println("셋톱박스를 먼저 키고, TV를 켭니다.");
		isTurnOn = true;

	}

	public void playYoutube() {
		System.out.println("스마트TV로 유튜브를 켭니다.");
	}

}
