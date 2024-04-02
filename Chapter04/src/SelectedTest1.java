/*
 * 작성일 : 2024년 3월 26일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단한다.
 *
 * 문제 분석 : 짝수는 2로 나눈 나머지가 0이다
 * 			홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 			세자리 수 : 100~999
 * 			123을 입력했을 때, 백의 자리는 1, 십의 자리는 2, 일의 자리는 3이다.
 * 			따라서, "백의 자리는 홀수", "십의 자리는 짝수", "일의 자리는 홀수"로 출력한다
 * 
 * 			백의 자리, 십의 자리, 일의 자리를 구분해야 한다.
 * 			힌트) 나누기와 나머지 연산자를 활용한다.
 * 
 * 알고리즘 : 1. 세자리 수를 입력 받는다.
 * 		   2. 세자리 수인지 확인한다.
 * 		   3. 입력 받은 수를 백의 자리, 십의 자리, 일의 자리로 구분한다.
 * 		   4. 구분한 각 자리의 수를 2로 나눈 나머지를 확인하여, 짝수/홀수를 출력한다.
 */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("세 자리의 수를 입력해 주세요 : ");
		int num = stdIn.nextInt();
		int num_100 = num / 100; // 100의 자리 몫 찾기
		int num_10 = (num % 100) / 10; // 10의 자리 몫 찾기
		int num_1 = (num % 100) % 10; // 1의 자리 몫 찾기
		if (num >= 100 && num <= 999) {
			if (num_100 % 2 == 0) {
				System.out.println("백의 자리는 " + num_100 +"이고, 짝수입니다.");
			}
			else {
				System.out.println("백의 자리는 " + num_100 +"이고, 홀수입니다.");
			}
			if (num_10 % 2 == 0) {
				System.out.println("십의 자리는 " + num_10 +"이고, 짝수입니다.");
			}
			else {
				System.out.println("십의 자리는 " + num_10 +"이고, 홀수입니다.");
			}
			if (num_1 % 2 == 0) {
				System.out.println("일의 자리는 " + num_1 +"이고, 짝수입니다.");
			}
			else {
				System.out.println("일의 자리는 " + num_1 +"이고, 홀수입니다.");
			}
		}
		else {
			System.out.println("세자리 수가 아닙니다. 다시 입력해주세요.");
		}
		
	}
}
