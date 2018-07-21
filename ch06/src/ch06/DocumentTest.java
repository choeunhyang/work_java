package ch06;
class Document{
	static int count = 0;	// static 다른 class와 공유해서 쓸수있다
	String name;	// 문서명(Document name)	// 공유X
	
	Document(){		// 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}
	Document(String name){		// 문서명을 지정했을 때
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}
public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}