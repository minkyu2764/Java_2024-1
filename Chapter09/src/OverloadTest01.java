/*
 * 작성일 : 2024년 5월 17일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 *  사용자로부터 값을 입력 받아 그 입력 값의 개수에 따라 도형의 넓이, 부피를 구하는 프로그램
 *  입력 값이 한 개이면 원의 넓이, 입력 값이 두 개이면 사각형의 넓이,
 *  입력 값이 세 개이면 육면체 부피를 계산합니다.
 *  넓이, 부피 계산하는 부분은 메소드 오버로딩으로 작성하시오.
 *  사용자가 엔터키를 누르면 입력을 종료하고,
 *  종료전에 입력한 숫자의 개수에 따라 도형의 결과 값을 출력합니다.
 *
 * [문제분석]
 * 
 * 		
 * 
 * [알고리즘]
 * 		
*/
import java.util.Scanner;

class Overload{
	public void shape(){   // 메소드 오버로딩
		System.out.println("매개 변수가 없습니다.");
	}
	
	public void shape(int r){   // 메소드 오버로딩
		System.out.println("원의 넓이 : " + r * r * 3.14);
	}
	
	public void shape(int width, int height){   // 메소드 오버로딩
		System.out.println("직사각형의 넓이 : " + width * height);
	}
	
	public void shape(int width, int height, int depth){   // 메소드 오버로딩
		System.out.println("직육면체의 부피 : " + width * height * depth);
	}
}

public class OverloadTest01 {
	public static void main(String args[]){
		Overload ol = new Overload();   // 객체 생성.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("도형의 종류에 따라 값을 입력해주세요:");
        System.out.println("1. 원의 경우 : 반지름의 길이");
        System.out.println("2. 직사각형의 경우 : 가로와 세로의 길이");
        System.out.println("3. 직육면체의 경우 : 가로, 세로, 높이의 길이");
        System.out.println("입력을 종료하려면 엔터키를 누르세요.");
			
        while (true) {
        	// 사용자로부터 한 줄을 입력받고(trim() 메서드를 사용하여 양쪽 공백을 제거한 후) 
        	// input 변수에 저장합니다.
        	// trim() 메서드를 사용하는 이유는 사용자가 입력할 때 
        	// 공백을 추가로 입력하는 경우를 방지하기 위함입니다.
        	// 사용자가 엔터키를 눌러 입력을 종료하면 이 입력은 빈 문자열("")이 됩니다.
        	String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
            	System.out.println("프로그램 종료");
                break; // 엔터키가 눌렸을 때 입력 종료
            }
            
	         // 입력된 문자열을 공백을 기준으로 분할하여 문자열 배열에 저장합니다.
	         // "\\s+"는 정규 표현식으로, 하나 이상의 공백을 나타냅니다.
	         // 따라서 입력된 문자열이 여러 개의 공백으로 구분되어 있어도 정확히 분할됩니다.
            String[] shape_len = input.split("\\s+");

            switch (shape_len.length) {
                case 1:
                    ol.shape(Integer.parseInt(shape_len[0]));
                    break;
                case 2:
                    ol.shape(Integer.parseInt(shape_len[0]), Integer.parseInt(shape_len[1]));
                    break;
                case 3:
                    ol.shape(Integer.parseInt(shape_len[0]), Integer.parseInt(shape_len[1]), Integer.parseInt(shape_len[2]));
                    break;
                default:
                    System.out.println("숫자의 개수가 맞지 않습니다.");
            }
        }
	}
}
