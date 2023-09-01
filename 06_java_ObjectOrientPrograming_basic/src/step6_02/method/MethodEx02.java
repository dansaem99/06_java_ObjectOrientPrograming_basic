package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	// 입력값도 없고 결과값도 없는 경우
	// void 자리는 타입이다. 예) int type00() { return10;}
	void type00 () {
		
		System.out.println("==============");
		System.out.println("1.로그인");
		System.out.println("1.로그아웃");
		System.out.println("1.조회");
		System.out.println("1.수정");
		System.out.println("1.탈퇴");
		System.out.println("==============\n");
		
		//return; // 반환하는 데이터가 없으면 return을 생략할 수 있다.
		
	}
	
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) { // String fileName = 매개변수 , 파라메타(parameter), 아구먼트, 인자 
		// 파일 이름을 적으면 파일을 만들어준다.
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 입력값은 없고 결과값은 있는 경우
	
	// 입력값과 결과값이 모두 있는 경우
	
}


public class MethodEx02 {

	public static void main(String[] args) {
		
		MethodType object = new MethodType();
		
		// 입력값도 없고 결과값도 없는 경우	
		object.type00();
		System.out.println();
		
		// 입력값은 있고 결과값은 없는 경우
		object.type10("팀버너스리.txt");
		object.type10("제임스고슬링.txt");
		object.type10("데니스리치.txt");
		
		// 입력값은 없고 결과값은 있는 경우		
		
		// 입력값과 결과값이 모두 있는 경우
		
	}

}


