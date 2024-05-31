/*
 * 작성일 : 2024년 5월 31일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [문제] Calculator_class 클래스를 작성하세요.
 * 	 이 클래스는 두 개의 정수와 실수를 더하고 빼는 메소드를 가집니다.
 *   int add(int a, int b) : 두 정수의 합을 반환합니다.					// 이름은 같지만 타입이 다르다.(int,double)
 *   double add(double a, double b) : 두 실수의 합을 반환합니다.			// 매소드 오버로딩이다.
 *   int subtract(int a, int b): 두 정수의 차를 반환합니다.
 *   double subtract(double a, double b) : 두 실수의 차를 반환합니다.
 *   
 *   Caculator 클래스
 *   main 메소드 : Caculator_class로부터 객체를 생성하고,
 *   			 두 정수를 입력 받아 합과 차를 출력합니다.
 *   
 *   [출력결과]
 *   첫 번째 정수 입력 : 3
 *   두 번째 정수 입력 : 5
 *   두 정수의 합계 : 8
 *   두 정수의 차 : -2
 *   첫 번째 실수 입력 : 7.3
 *   두 번째 실수 입력 : 5.5
 *   두 실수의 합계 : 12.8
 *   두 실수의 차 : 1.8
 *   
 * [설명]
*/

import java.util.Scanner;

class Calculator_class {
	// 더하기 메소드
	public int add (int a, int b) {
		return a + b;
	}
	// 더하기 메소드 오버로딩
	public double add (double a, double b) {
		return a + b;
	}
	// 빼기 메소드
	public int subtract (int a, int b) {
		return a - b;
	}
	// 빼기 메소드 오버로딩
	public double subtract (double a, double b) {
		return a - b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		Calculator_class calc = new Calculator_class();
		Scanner stdIn = new Scanner(System.in);
		
		// 2개의 정수를 입력 받아 결과 출력
		System.out.print("첫 번째 정수 입력 ㅣ ");
		int int_num1 = stdIn.nextInt();
		System.out.print("첫 번째 정수 입력 ㅣ ");
		int int_num2 = stdIn.nextInt();
		System.out.println("두 정수의 합계 : " + calc.add(int_num1, int_num2));
		System.out.println("두 정수의 차 : " + calc.subtract(int_num1, int_num2));
		System.out.println("------------------------");
		
		// 2개의 실수를 입력 받아 결과 출력
		System.out.print("첫 번째 실수 입력 ㅣ ");
		double double_num1 = stdIn.nextDouble();
		System.out.print("두 번째 실수 입력 ㅣ ");
		double double_num2 = stdIn.nextDouble();
		System.out.println("두 실수의 합계 : " + calc.add(double_num1, double_num2));
		System.out.println("두 실수의 차 : " + calc.subtract(double_num1, double_num2));

	}

}
