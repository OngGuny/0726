
public class FloatingDemo {
	public static void main(String[] args) {
		double avg = 89.55556789;
		System.out.printf("avg=%f\n",avg); //85.5까지만 했는데 왜 소수점 6자리까지 나옴? c언어 형식이라. 6자리까지 무조건. 이게 기본형 7번째 자리에서 반올림 
		System.out.println("avg="+avg); //원 값
		System.out.printf("avg=%.2f\n",avg); // 실수형 값
		// 소숫점 3째자리에서 반올림해서 2번째 자리까지만 나타내고 싶어. > %.2f 
		
		System.out.printf("avg = %e\n", avg);
		
		/* 지수형 으로 나타내기 
		 * 123.456789 (실수형)-> 1.23456E+02(지수형) 6자리까지만 나타내고 7째에서 반올림 나머지는 지수로 나타냄. 
		 */
		System.out.println("-----------------------------------------------------------");
		double avg2 = 0.089555556789;
				System.out.println("avg="+avg2); //원 값
		System.out.printf("avg=%.2f\n",avg2); // 실수형 값
		System.out.printf("avg = %e\n", avg2);
		
		System.out.println("---------------------------------------------------------");
		float f = 0.123456789123456789f;
		double d = 0.123456789123456789;
		System.out.println("f="+f);
		System.out.println("d="+d);
		// 실수형 더 정확하게 나오는건 float보다는 double이므로 기본을 더블로 쓴다. 
	}
}
