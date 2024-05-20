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
class Box5 {
	int width;
	int height;
	int depth;
	public Box5() {
		width = 1;
		height = 1;
		depth = 1;
	}
	public Box5(int w) {
		width = w;
		height = 1;
		depth = 1;
	}
	public Box5(int w, int h) {
		width = w;
		height = h;
		depth = 1;
	}
	public Box5(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
}
public class BoxOverloading01 {

	public static void main(String[] args) {
		Box5 mybox1 = new Box5();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 (매개 변수 없음) : " + vol);
		mybox1 = new Box5(10);
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 (매개 변수 1개) : " + vol);
		mybox1 = new Box5(10, 20);
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 (매개 변수 2개) : " + vol);
		mybox1 = new Box5(10, 20, 30);
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 (매개 변수 3개) : " + vol);

	}

}
