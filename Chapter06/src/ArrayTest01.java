/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값은 출력한다.
 *
 * 문제분석 :  
 * 
 * 알고리즘 :
 *
 */

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num[] = new int[5];
		System.out.println("배열의 길이 : " + num.length);
		
		System.out.println("배열에 저장된 초기값");
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("배열에 저장된 값");
		for (int i = 0; i <num.length; i++) {
			System.out.print("num [" + i + "] = ");
			num[i] = stdIn.nextInt();
		}
		System.out.println("배열에 저장된 값");
		for(int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		// 배열에 저장된 값들의 합과 평균 계산하여 출력
		// sum = sum + num => num[0] + num[1] + num[2] ...
		int sum = 0;
		System.out.println("배열에 저장된 값들의 합과 평균 계산하여 출력");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		double avg;
		avg = (double)sum / num.length;
		System.out.println("배열에 저장된 값들의 합 : " + sum);
		System.out.println("배열에 저장된 값들의 평균 : " + avg);
		}
		
	}
