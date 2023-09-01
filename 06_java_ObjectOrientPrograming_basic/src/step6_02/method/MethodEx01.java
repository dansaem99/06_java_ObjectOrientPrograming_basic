package step6_02.method;

/*
 * 
 *  # 클래스의 구성요소
 *  
 *  [1] 멤버변수 , 필드 , 프로퍼티 = 속성
 *  [2] 메서드 = 기능
 *  그래서 클래스의 구성은 속성과 기능이 있다.
 * 
 * 
 *  # 메서드 
 *  
 *  - 클래스 기반 언어에서 클래스 내부에 정의되어 있다. 
 *  - 메서드는 프로그램이 실행되고 있을 때 클래스에서 생성된 인스턴스와 관련된 동작을 정의한다.
 *  
 *  [ 형태 ]
 * 
 * 	1) void : return 타입 (int , double , char , String , int[] , Product , ....)
 * 	2) printMenu  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  3) ()   : 입력인수 (파라메타 , 매개변수 , 아규먼트 , 인자)
 *  4) {}   : 메서드의 영역
 *  
 * */

class MethodEx {
	
	// 메서드 정의 (define = 정의하다)
	// undefined
	void printMenu() {
		System.out.println("==============");
		System.out.println("1.로그인");
		System.out.println("1.로그아웃");
		System.out.println("1.조회");
		System.out.println("1.수정");
		System.out.println("1.탈퇴");
		System.out.println("==============\n");
		
		return;
	}
	
}

public class MethodEx01 {

	public static void main(String[] args) {

		MethodEx object = new MethodEx();
		
		// 메서드 호출(call)
		// 객체.메서드명(); 형태로 사용한다.
		object.printMenu(); // 자동입력에서 세모는 메서드라는 뜻이다.
		object.printMenu();
		object.printMenu();
		
	}

}
