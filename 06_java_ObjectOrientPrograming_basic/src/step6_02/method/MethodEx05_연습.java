package step6_02.method;

import java.util.Scanner;

class Ex05{

	void test1() {
		int total = 0;
		for (int i = 0; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수" + (i + 1) + " 입력 : ");
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		scan.close();
	}
	
}


public class MethodEx05_연습 {

	public static void main(String[] args) {

			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();



	}

}
