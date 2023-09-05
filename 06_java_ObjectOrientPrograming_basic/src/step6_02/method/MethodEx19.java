package step6_02.method;

/*
 * 
 * # 메서드 오버로딩(overloading) , 메서드 중복정의
 * 
 *  1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 *  같은 이름으로 만들어진 여러개의 메서드를 사용할 수 있는 기법  [ 메서드 오버라이딩과 헷갈림 주의 ]
 *  
 */

class MethofOverloadingEx {
	
	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	int add(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
}

public class MethodEx19 {

	public static void main(String[] args) {

		MethofOverloadingEx object = new MethofOverloadingEx();
		
		System.out.println(object.add(123, 321));
		System.out.println(object.add(123, 456, 789));
		System.out.println(object.add(3.14, 5.14));
		int[] temp = {1,2,3,4,5};
		System.out.println(object.add(temp));
		
		// (참고)오버로딩 사용예시
		System.out.println(1);
		System.out.println('a');
		System.out.println("글자");
		System.out.println(3.14);
		System.out.println(true);
		
		System.out.println("megait".substring(2));//2부터 끝까지
		System.out.println("megait".substring(2,4));//2부터 4까지
		
		
	}

}
