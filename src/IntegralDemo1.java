
public class IntegralDemo1 {
	public static void main(String[] args) {
		byte age = 26;  // 4비트 범위 -128~127, 범위 내의 값 오류 x.. 의미없는 왼쪽의 0값들 다자르면 정보 량 줄일 수 있어서 표현 가능. 
		
		short l = 32767;	// max 32767인데 1더 큰값. 이건 값손실일어나는값이라 인식x -- ㅇ
		byte a = 5; //의미없는 3바이트 자르고 1바이트만 표현
		byte b = 9;
		//byte sum = a+b; // 왜 에러가 나는가? 자바는 2항연산일때는 무조건 int가 된다. 이렇게 int가되면 자동으로 변환이 안된다. 근데 int는 byte값으로 못들어감 
		
		byte sum = (byte)(a+b);
		int sum1 = a+b;			//강제 형변환 해주던가 아니면 정수형으로 써준다. 

		long money = 10_000_000_000L; //큰 숫자는 일일히 세야한다. 그래서 실무의  ,대신 _를 써서 구분 해 준다. 
		
		
	
	}
}
