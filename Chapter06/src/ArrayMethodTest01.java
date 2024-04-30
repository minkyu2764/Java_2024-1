/*
 * 작성일 : 2024년 4월 19일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * 설명 : Arrays 클래스와 system 클래스에서 제공하는 메소드 연습
 *
 */

import java.util.Arrays;

public class ArrayMethodTest01 {

	public static void main(String[] args) {
		int num1[] = {9, 1, 7, 3, 5, 4, 6, 2, 8, 0};
		System.out.println("초기 배열 : " + Arrays.toString(num1));
		
		Arrays.fill(num1,  3, 5, 33); // num1의 3번지부터 4번지까지 33으로 채우는 메소드
		System.out.println("fill() 메소드 수행 후 : " + Arrays.toString(num1));
		
		// 정렬 : 오름차순
		Arrays.sort(num1);
		System.out.println("sort() 메소드 수행 후 : " + Arrays.toString(num1));
		
		// Arrays.binarySearch() 메소드는 배열에서 33의 위치를 찾는다.
		// 이 메소드를 사용하기 위해서는 반드시 요소들이 정렬되어 있어야 한다.
		System.out.println("33은 배열이 " + Arrays.binarySearch(num1, 33)+ "번째 요소");
		
		int num2[] = {5, 4, 3, 2, 1};
		
		System.out.println("num2[] 배열 " + Arrays.toString(num2));
		
		// 두 배열을 비교하여 결과 반환
		System.out.println("두 배열은 같은가 ? " + Arrays.equals(num1, num2));
		
		int [] num3 = new int [5]; // 배열 생성
		
		// 배열에 값 복사하는 메소드
		// num2 배열의 0번지부터 num3의 0번지 위치로 3개 복사된다.
		// 남은 공간은 디폴트 값 0으로 저장된다.
		System.arraycopy(num2,  0, num3, 0, 3);
		System.out.println("복사된 배열 : " + Arrays.toString(num3));
		
		

	}

 }
