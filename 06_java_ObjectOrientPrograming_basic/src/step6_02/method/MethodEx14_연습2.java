package step6_02.method;

import java.util.Scanner;

class Theater1 {
	
	Scanner scan = new Scanner(System.in);
	
	int[] seat = new int[10];
	int bookCnt = 0;
	int money = 0;
	
	// menu 선택하기
	void showMenu() {
		
		System.out.println("=== 메가박스 ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
		
	}
	
	// 현재 좌석 보여주기
	void showSeat() {
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print(" [X] ");
			}
			else {
				System.out.println(" [O] ");
			}
		}
		System.out.println();
		
	}
	
	// 좌석 예매하기
	void choiceSeat() {
		showSeat();
		
		System.out.println("좌석번호를 선택하세요[1 ~ 10] : ");
		int idx = scan.nextInt() - 1;
		
		if (seat[idx] == 0) {
			seat[idx] = 1;
			bookCnt++;
			System.out.println("예매를 완료하였습니다.");			
		}
		else {
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}
	}
	
	void showSales() {
		money = bookCnt * 12000;
		System.out.println("총 매출 금액 = " + money + "원");
	}
	
	void run() {
		
		while (true) {
			showMenu();
			
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				choiceSeat();
			}
			else if (choice == 2) {
				showSales();
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
	
}

public class MethodEx14_연습2 {

	public static void main(String[] args) {
		Theater1 megabox = new Theater1();
		megabox.run();
	}
	
}
