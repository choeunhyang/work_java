package test02;

public class ObjectTest3 {
	private int age;
	private String name;
	
	public ObjectTest3(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "�̸� : " + this.name +", ���� : " + this.age;
	}
	
	public static void main(String[] args) {
		// �����ڸ� ����ؼ�
		// �̸� : ȫ�浿, ���� : 22
		// �̸� : �̱浿, ���� : 32
		// �̸� : ���浿, ���� : 42
		ObjectTest3 ot3 = new ObjectTest3("ȫ�浿", 22);
		System.out.println(ot3);
		ot3 = new ObjectTest3("�̱浿", 32);
		System.out.println(ot3);
		ot3 = new ObjectTest3("���浿", 42);
		System.out.println(ot3);
	}
}
