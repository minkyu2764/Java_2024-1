/*
 * 작성일 : 2024년 3월 26일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 조건식 연습
 *		 숫자와 연산자를 입력 받아
 *		 사칙연산 프로그램을 작성하시오.
 *	     입력 방식 : 3 + 4 (띄어쓰기로 구분)
 *
 * 문제 분석 : 숫자 연산자 숫자를 입력 받아
 * 			해당 연산자에 따른 결과를 출력한다.
 * 
 * 			나눗셈의 결과는 소수자리가 나온다.
 * 			소수 2자리까지 출력한다.
 * 
 * 			나누기 할 때는 0으로 나눌 수 없다.
 * 			두번째 수가 0이면,
 * 			"나눌 수 없습니다." 출력하기
 */

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("숫자 연산자 숫자를 입력해 주세요 (띄어쓰기로 구분) : ");
		int num1 = stdIn.nextInt();
		/* 사용자로부터 입력된 문자열에서 첫 번째 문자, 즉 연산자를 추출한다.
		 * stdIn.next()는 문자열을 입력받는 메서드이다.
		 * 입력된 문자열에서 첫번째 문자를 추출하기 ㅟ해서는 charAt(0)을 사용한다.
		 * 3 + 4와 같이 입력했을 때 '+' 연산자를 추출할 수 있다.
		 */
		char op = stdIn.next().charAt(0);
		int num2 = stdIn.nextInt();
		
		
		
		switch (op) {
		case '+' :
			System.out.println(num1 +"+"+ num2 +"="+(num1+num2));
			break;
		case '-' :
			System.out.println(num1 +"-"+ num2 +"="+(num1-num2));
			break;
		case '*' :
			System.out.println(num1 +"*"+ num2 +"="+(num1*num2));
			break;
		case '/' :
			if (num2 == 0) {
				System.out.println("나눌 수 없습니다.");
				break;
			}
			System.out.println(num1 +"/"+ num2 +"= " + ((double) num1/num2));
			break;
		default :
			System.out.println("잘못된 연산자 입력입니다.");
		}	
	}
}
