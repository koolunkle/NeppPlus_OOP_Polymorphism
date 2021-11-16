package Codes;

import Codes.datas.SmartTv;
import Codes.datas.Tv;
import Codes.datas.VideoTv;

public class MainDrive {

	public static void main(String[] args) {

		Tv tv1 = new Tv();
		tv1.turnOnTv();

		Tv tv2 = new SmartTv();
		tv2.turnOnTv();

		SmartTv stv1 = (SmartTv) tv2;
		stv1.playYoutube();

//		tv2.playYoutube() => SmartTv에 있는 기능이기 때문에 사용 불가. 변수는 TV형태니까.

		Tv tv3 = new VideoTv();
		tv3.turnOnTv();
//		tv3.record => VideoTv에 있는 기능은 Tv형태로 담았을 때는 사용 불가.

	}

}
