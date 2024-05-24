/*
 * 작성일 : 2024년 5월 24일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 * 	
*/
public class ObjectMethodTest4 {

	public static void main(String[] args) {
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		System.out.println(s1.equals(s2) ? "s1과 s2는 같다" : "s1과 s2는 같지 않다");
		System.out.println(s1 == s2 ? "s1과 s2는 같다" : "s1과 s2는 같지 않다");
	}
}
