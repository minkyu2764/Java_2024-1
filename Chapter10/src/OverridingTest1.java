/*
 * 작성일 : 2024년 5월 24일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 * 	메소드 오버라이딩 1
*/

class OT1a {
	// 매개 변수가 1개인 메소드 생성
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show(String str) 수행 : " + str);
	}
}
class OT1b extends OT1a {	// 상속됨.
	// 매개 변수가 없는 메소드 생성. 오버라이딩 아님.
	public void show() {
		System.out.println("하위 클래스 메소드 show() 수행 : ");
		// 이 클래스에는 매개 변수가 있는 메소드와 없는 메소드 2개가 있다.
	}
}
public class OverridingTest1 {

	public static void main(String[] args) {
		OT1b otb = new OT1b();
		otb.show("처음 시작하는 자바");
		otb.show();
	}

}
