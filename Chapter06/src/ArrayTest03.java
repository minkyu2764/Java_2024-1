/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성하시오.
 * 		사용자로부터 정수를 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 * 		입력한 값이 배열에 없다면 "입력한 값이 없습니다." 를 출력하시오.
 * 
 * 문제분석 : 배열 만들기
 * 		   개수를 찾을 정수 입력받기
 * 	 	   배열의 0번째 방부터 배열의 길이까지 반복하여 입력한 정수가 있는지 확인하기
 * 		   입력한 정수가 있으면 해당 배열의 번지수를 출력하고, cnt 변수를 1씩 증가시키기
 * 		   입력한 정수가 없으면 입력한 값이 없습니다. 출력하기
 * 		   
 * 
 * 알고리즘 : 배열 만들기 int num[] = {12, 43, 9, 45, 77, 84, 23, 81, 34};
 * 		   개수를 찾을 정수 입력하기 (Scanner 객체 생성, input 변수 활용)
 * 		   입력받은 정수의 개수를 세는 변수 만들기 int cnt = 0;
 * 		   배열의 0번째 방부터 배열의 길이까지 반복 for (int i=0; i<num.length; i++)
 * 		   반복하며 입력한 정수가 있는지 확인하기 if (num[i] == input)
 * 		   입력한 정수가 있으면 해당 배열의 번지수를 출력하고, System.out.println("num [" + i + "]"); cnt 변수를 1씩 증가시키기 cnt++;
 * 		   입력한 정수가 없으면 (반복문이 끝난 후 cnt의 값이 0이면) 입력한 값이 없습니다. 출력하기 System.out.println("입력한 값이 없습니다.);
 *
 */

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int num[] = {12, 12, 9, 45, 77, 84, 23, 81, 34};
		// 스캐너
		Scanner stdIn = new Scanner(System.in);
		int cnt = 0;
		System.out.print("찾고 싶은 정수 입력 : ");
		int input = stdIn.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (num[i] == input) {
				System.out.println("num [" + i + "] 번지");
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("입력한 값이 없습니다.");
		}
		else {
			System.out.println("입력한 정수와 중복된 값은 " +cnt +"개 있습니다.");
		}
		
	}

}
