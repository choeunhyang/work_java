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
		return "���̸��� " + this.heroName + "�̸� " + this.power + "������ ���� �ְ� " + this.speed + "������ ������";
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4("�ѶѺ�",10,2);
		ot4s[1] = new ObjectTest4("�Ѷѹ�",8,6);
		/*String str = ot4s[0].toString();//�׳� �̰� �� ���� ����
		System.out.println(str);*/   
		
		for(ObjectTest4 ot4 : ot4s) {
			System.out.println(ot4);
		}
	}
}
