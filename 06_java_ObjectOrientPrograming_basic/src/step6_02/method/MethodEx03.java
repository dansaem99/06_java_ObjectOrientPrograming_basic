package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnEx {
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
		//return 1,2,3,4,5; error 리턴값은 오로지 1개만 가능하다.
		return 0; // return 후 break가 자동으로 작동된다.
		
		// error => 리턴이 실행되는 순간 메서드가 종료된다.
		// System.out.println("리턴 후 명령어1");
		// System.out.println("리턴 후 명령어2");
		// System.out.println("리턴 후 명령어3");
		
	}
	
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx r = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출전의 성적 : " + score1); // 87
		
		r.setScore1(score1);
		System.out.println("메서드 호출후의 성적 : " + score1); // 87
		
		System.out.println("\n===============\n");
		
		int score2 = 87;
		System.out.println("메서드 호출전의 성적 : " + score2); // 87
		
		r.setScore2(score2);
		System.out.println("메서드 호출후의 성적 : " + score2); // 40줄에 87이다.
		
		score2 = r.setScore2(score2);
		System.out.println("메서드 호출후의 성적 : " + score2); // 100

	}

}
