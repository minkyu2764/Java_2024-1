/*
 * 작성일 : 2024년 5월 28일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 * 연산 기능을 제공하는 Caculator 클래스. 
 * 객체를 생성할 때 두 개의 숫자와 연산자를 초기화 할 수 있어야 한다. (this)를 사용한다
 * 계산 기능은 switch 문을 사용하여 메서드로 구현, 계산 결과는 private 변수로 처리 (private int result)
 * CalcMain 클래스는 프로그램을 실행하고, 사용자 입력을 받아 Caculator 인스턴스를 생성하여 연산 결과를 받아 출력한다.
*/
import java.util.Scanner;

class Caculator {
	private int num1, num2;
	private String op;
	private int result; // 계산 결과는 private 변수로 처리한다
	
	public int result() {
		return result; // 연산이 끝난 후 연산 결과를 반환해준다.
		}
	public Caculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
		set();
	}
	public void set() {
		switch (op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			default : result = 0;	// 연산자가 +, -, *, / 를 제외한 문자가 입력될 경우 결과 값을 0으로 처리
		}
	}
	
}

public class CaculatorExam { // CalcMain 클래스.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		Caculator cal = new Caculator(num1, num2, op); // 인스턴스를 생성하여 입력받은 숫자와 연산자를 Caculator로 보낸다.
		System.out.println(cal.result()); // private으로 선언된 result 값을 메서드를 선언하여 반환 받기.
		
	}
}
