/*
 * 작성일 : 2024년 4월 2일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오.
 *
 * 문제분석 :  5! = 5 * 4 * 3 * 2 * 1 => 120
 * 			입력 받은 수부터 1까지 1씩 감소하면서
 * 			곱셈을 한다.
 * 			팩토리얼  = 팩토리얼 * 수
 * 				5  =	1	 *	 5
 * 				20 =	5	 *	 4
 * 				60 =	20	 *	 3
 * 				120 =	60	 *	 2
 * 				120 =	120	 *	 1
 * 
 * 알고리즘 :  1. 정수를 입력 받는다.
 * 			2. 팩토리얼은 입력받은 수부터
 * 			3. 1까지 반복하면서
 * 				3-1. 팩토리얼을 계산한다.
 * 				3-2. 1씩 감소한다.
 * 			4. 결과를 출력한다.
 */

import java.util.Scanner;

public class WhileTest3 {

   public static void main(String[] args) {
	   // Scanner 객체 생성
	  Scanner stdIn = new Scanner(System.in);
	  System.out.print("팩토리얼 값을 알고 싶은 정수를 입력해주세요 : ");
	  int num = stdIn.nextInt();
	  int fac = 1;
	  System.out.print(num+"! = ");
	  while (num >= 1) {
		  fac *= num;
		  num--;
	  }
      System.out.println(fac);

   }

}
