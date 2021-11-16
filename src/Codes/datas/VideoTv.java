package Codes.datas;

public class VideoTv extends Tv {

	@Override
	public void turnOnTv() {

		System.out.println("비디오 플레이어를 켜고, TV를 켭니다.");
		isTurnOn = true;
	}

	public void recordVideo() {
		System.out.println("TV 화면을 비디오에 녹화합니다.");
	}

}
