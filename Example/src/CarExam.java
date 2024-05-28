/*
 * 작성일 : 2024년 5월 28일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 * 이름, 색깔, 속도를 가지는 Car 클래스 정의
 * 매개변수로 값을 넘겨받아 이름만 초기화하는 생성자, 이름과 색깔을 초기화하는 생성자, 모든 멤버변수들을 초기화하는 생성자를 각각 정의
 * 멤버변수들을 출력하는 메소드도 정의한다.
*/

class Car {
	public String name, color;
	public int speed;
	
	public Car(String name) { 	// 매개변수가 1개인 경우
		this.name = name;
	}
	public Car(String name, String color) { // 매개변수가 2개인 경우
		this.name = name;
		this.color = color;
	}
	public Car(String name, String color, int speed) { // 매개변수가 3개인 경우
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	public void show_car() { // 멤버변수들을 출력하는 메소드
		System.out.println("차종 : " + name + ", 색깔 : " + color +", 속도 : " + speed);
	}
}
public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car("제네시스", "검정", 240);
		c1.show_car();
		Car c2 = new Car("BMW", "빨강", 200);
		c2.show_car();

	}

}
