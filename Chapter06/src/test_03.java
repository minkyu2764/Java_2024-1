/* 2024년 04월 23일 중간고사 실기
 * 컴퓨터소프트웨어공학부 202195007 김민규
 * 
 * 설명 : 1부터 입력받은 수까지의 각 수의 약수를 구하기, 소수이면 소수 출력
 * 
 * 문제 분석 : 정수 입력받기 (입력받은 수까지 약수를 구하기 위함)
 * 			소수인지 판별하기 위해 cnt 변수를 입력받기. (약수가 2개, 즉 1과 자기자신 뿐이면 소수이기 때문에 cnt가 2면 소수이다.)
 * 			반복문을 사용하여, 1부터 입력받은 수까지 반복하여 약수를 구하고, cnt 변수를 이용하여 소수인지 판별한다 (if cnt == 2)
 * 		
 *
 *
 * 알고리즘 : 정수를 입력받는다. (입력받은 수까지의 약수를 구하기 위함)
 * 		   소수인지 판별하기 위해 cnt 변수를 선언 (if cnt==2) 면 소수이다.
 * 		   1부터 입력받은 수까지 반복하여 약수를 구한다.
 * 		   반복이 끝날 때마다 cnt 변수를 0으로 초기화시킨다. (소수를 구하기 위함. cnt==2이면 소수인데, 초기화를 시키지 않으면 cnt의 수가 중첩돼서 소수를 구하기 힘들어진다.)
 * 		   1부터 입력받은 수까지의 약수를 출력하고, 조건문을 이용하여 소수인지까지 출력한다.
 * */


import java.util.Scanner;

public class test_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // Scanner
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt(); // 정수 입력 받기
		int i;
		int j;
		for (i = 1; i <= num; i++) {
			int cnt = 0; // cnt는 한 수의 반복이 끝나면 항상 0으로 초기화한다. 이유는 cnt가 2이면 소수인데, cnt를 0으로 초기화하지 않으면 소수인지 판별하기에 어려움이 있다.
			System.out.print(i +"의 약수 : ");
			for (j = 1; j<= i; j++) {
				if (i % j == 0) {
		    		  System.out.print(j+" ");
		    		  cnt ++; // 약수를 출력할 때마다 cnt 변수를 1 증가시킨다. cnt가 2면 소수이다.
		    	  }
			}
			if (cnt==2) { // cnt가 2라면?
				System.out.print("소수이다");
			}
			System.out.println(" ");
		}
			

	}

}
