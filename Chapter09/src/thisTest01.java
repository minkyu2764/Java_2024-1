/*
 * 작성일 : 2024년 5월 10일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 
 *
 * [문제분석]
 * 		
 * 
 * [알고리즘]
 * 		
*/
class Box1 {
	int width, height, depth; // 멤버 변수
	
	// 생성자.
	// 매개 변수로 지정된 w, h, d는 의미를 알기 어렵다.
	
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
		
	}
}
public class thisTest01 {

	public static void main(String[] args) {
		Box1 myBox = new Box1(1, 2, 3);
		System.out.println(myBox.width);

	}

}
