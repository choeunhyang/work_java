package test02;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	public ObjectTest4(String heroName, int power, int speed) {
		this.heroName=heroName;
		this.speed=speed;
		this.power=power;
	}
	
	public String toString() {
		return "내이름은 " + this.heroName + "이며 " + this.power + "정도의 힘이 있고 " + this.speed + "정도로 빠르지";
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4("뚜뚜비",10,2);
		ot4s[1] = new ObjectTest4("뚜뚜바",8,6);
		/*String str = ot4s[0].toString();//그냥 이거 만 쓰면 에러
		System.out.println(str);*/   
		
		for(ObjectTest4 ot4 : ot4s) {
			System.out.println(ot4);
		}
	}
}
