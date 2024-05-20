
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

class Box4 {
	int width, height, depth; 	// 멤버 변수
	
	// 생성자.
	public Box4() {
		// this의 다른 역할은 다른 생성자 호출.
		// 반드시 첫번째 라인에 위치해야 한다.
		this(1,1,1);
		System.out.println("매개 변수가 없는 생성자 수행");
	}
	
	// 생성자 오버로딩
	public Box4(int width, int height, int depth) {
		System.out.println("매개 변수 3개 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	
}
public class thisTest04 {

	public static void main(String[] args) {
		Box4 myBox1 = new Box4();
		int vol = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println("박스의 부피(매개 변수 없음) : " + vol);

		myBox1 = new Box4(10, 20, 30);
		vol = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println("박스의 부피(매개 변수 3개) : " + vol);
	}

}
