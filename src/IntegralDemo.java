
public class IntegralDemo {
	public static void main(String[] args) {
		System.out.printf("255의 10진수 : %d\n",255 );		//print'f' 형식에 맞게 출력하라는 것.  형식을 맞추려면 '%_' 를 사용 뒤에 적어줄 d에해당하는 값은 , 를쓰고 뒤에 값을 적어줌
		System.out.println("255의 2진수 : "+Integer.toBinaryString(255));						//binary . >> 이건 boolean의 약자라 겹침.  2진수는 tobinary씀 
		System.out.printf("255의 8진수 : %o%n",255);					//octa 의 약자 
		System.out.printf("255의 16진수 : %x%n",255);			//헥사  \n 은 출력하고 줄바꿈. 안에다 써줌   %n도 가능
		System.out.println("----------------------------------");
		System.out.printf("0b01110000의 10진수 : %d\n", 0b01110000 );		
		System.out.println("0b01110000의 2진수 : "+Integer.toBinaryString(0b01110000));					
		System.out.printf("0b01110000의 8진수 : %o%n",0b01110000);					
		System.out.printf("0b01110000의 16진수 : %x\n",0b01110000);		
		System.out.println("----------------------------------");
		System.out.printf("056의 10진수 : %d\n", 056 );		
		System.out.println("056의 2진수 : "+Integer.toBinaryString(056));					
		System.out.printf("056의 8진수 : %o%n",056);					
		System.out.printf("056의 16진수 : %x\n",056);		 //0을 숫자앞에 붙이면 8진수로 인식한다. 
		
		System.out.println("----------------------------------");
		System.out.printf("0xAB의 10진수 : %d\n", 0xAB );		
		System.out.println("0xAB의 2진수 : "+Integer.toBinaryString(0xAB));					
		System.out.printf("0xAB의 8진수 : %o%n",0xAB);					
		System.out.printf("0xAB의 16진수 : %x\n",0xAB);		 //16진수는 0x를 붙여준다. 
		
		//ab는 a는 10 b는 11 
		//명령들의 집합을 프로그램 
		//cpu에게 일을 시키는게 사람 
		
		/*int 쓰고 남는 자리는 0으로 표현, 생략. 
		 * 2진수를 적을때는 0+b를 앞에 붙여줘야한다. 아니면 자바 기본에서는 10진수로 받아들이고 앞의 0 은 무시한다. 
		 */
		
		
		
		
	}
}
