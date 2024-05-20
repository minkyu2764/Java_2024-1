/*
 * 작성일 : 2024년 5월 3일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 클래스 모음 , 참조
 *
 * 문제분석 :  
 * 
 * 알고리즘 :
 *
 */
// 클래스 선언
class Box2 {
	// 속성. - 멤버 변수
	int width = 10;
	int height = 20;
	int depth = 30;
}
// 메인 메소드가 있는 클래스
public class Box2Test1 {
	public static void main(String[] args) {
		int myint1 = 100; // 지역변수, 기본 자료형 변수.
		int myint2 = myint1;
		System.out.println("첫 번째 값 : " + myint1 + "두 번째 값 : " + myint2);
		myint1 = 200;
		System.out.println("첫 번째 값 : " + myint1 + "두 번째 값 : " + myint2);
		
		// 객체 생성
		Box2 mybox1 = new Box2(); // 서로 다른 참조 자료형 객체 변수 생성.
		Box2 mybox2 = new Box2();
		
		mybox1.width = 20; // 각각 객체 변수를 통해서 속성 값 변경.
		mybox2.depth = 123;
		
		System.out.println("mybox1.width : " + mybox1.width);
		System.out.println("mybox1.height : " + mybox1.height);
		System.out.println("mybox1.depth : " + mybox1.depth);
		
		System.out.println("");
		
		System.out.println("mybox2.width : " + mybox2.width);
		System.out.println("mybox2.height : " + mybox2.height);
		System.out.println("mybox2.depth : " + mybox2.depth);
		
		// 같은 주소를 가리킨다. 공유한다.
		Box2 mybox3 = mybox2;
		mybox2.width = 1000; // mybox3와 같은 주소에 값이 변경.
		mybox2.height = 2000;
		
		System.out.println("");
		
		System.out.println("mybox3.width : " + mybox3.width);
		System.out.println("mybox3.height : " + mybox3.height);
		System.out.println("mybox3.depth : " + mybox3.depth);
		
		
	}

}
