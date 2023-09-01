package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}

class Ex03_1 {
	int[] arr = {87, 100, 11, 72, 92};
}

public class ClassEx03_연습 {

	public static void main(String[] args) {
		
		Ex03_1 ex03_1 = new Ex03_1();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for (int i = 0; i < ex03_1.arr.length; i++) {
			total += ex03_1.arr[i];
		}
		System.out.println(total + "\n");
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int drainage4 = 0;
		for (int i = 0; i < ex03_1.arr.length; i++) {
			if (ex03_1.arr[i] % 4 == 0) {
				drainage4 += ex03_1.arr[i];
			}
		}
		System.out.println(drainage4 + "\n");
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < ex03_1.arr.length; i++) {
			if (ex03_1.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt + "\n");
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		cnt = 0;
		for (int i = 0; i < ex03_1.arr.length; i++) {
			if (ex03_1.arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		



	}

}
