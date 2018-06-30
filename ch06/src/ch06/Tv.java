package ch06;

class Tv{
	// Tv의 속성(멤버변수)
	String color;		// 색상
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널

	// Tv의 기능(메서드)
	void power() { power = !power; }	// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; }	// TV의 채널을 높이는 기능을 하는 메서드 
	void channelDown() { --channel; }	// TV의 채널을 낮추는 기능을 하는 메서드
}		// 파랑색으로 표시되는건 같다는거
//같은 패키지 안에 있으면 하나만 있어도 그 클래스를 사용 할수 있음
