/*
 * 작성일 : 2024년 3월 29일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고,
 * 그렇지 않고 두 수중 하나라도 홀수이면 몇 번째 입력한 수를 짝수로 입력해야 하는지 출력하시오.
 *
 * 문제 분석 : 
			짝수는 2로 나눈 나머지가 0이다.
			홀수는 2로 나눈 나머지가 1이다 (0이 아니다.)
			if 두 수가 모두 짝수이면 두 수의 합을 더한다
			else if 두 수 모두 홀수이면 홀수 출력하기
			else(두 수중 하나가 홀수인 경우) 홀수인 숫자 출력하기
			
			짝/짝 홀/짝 짝/홀 홀/홀
			
			
			
 *			 
 * 알고리즘 :	1. 정수 2개 입력 받기
 * 			2. 만약 두 수가 모두 짝수이면
 * 				2-1. 합계를 계산하고 출력한다
 * 			3. 아니고 두 수가 모두 홀수이면
 * 				3-1 두 수 모두 짝수로 입력하세요. 출력하기 
 * 		    4. 아니고 만약 첫 번째 수가 홀수이고, 두 번째 수가 짝수이면
 * 				4-1. 첫 번째 수를 짝수로 입력하세요. 출력하기
 * 			5. 아니고 만약 두 번째 수가 홀수이고, 두 번째 수가 짝수이면
 * 				5-1. 두 번째 수를 짝수로 입력하세요. 출력하기
 */

import java.util.Scanner;

public class SelectedTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("짝수인지 판별할 숫자 두 개를 입력해 주세요 : ");
		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();
		int sum = 0;
		
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			sum = num1 + num2;
			System.out.print(sum);
		}
		else if (num1 % 2 == 1 && num2 % 2 == 1) {
			System.out.println("두 수 모두 홀수입니다. 짝수로 입력해 주세요.");
		}
		else{
			if (num1 % 2 == 1) {
				System.out.println("첫 번째 숫자는 "+num1+"이고, 홀수입니다. 짝수로 입력해 주세요.");
			}
			if (num2 % 2 == 1) {
				System.out.println("두 번째 숫자는 "+num2+"이고, 홀수입니다. 짝수로 입력해 주세요.");
			}
		}
		
		
	}
}
