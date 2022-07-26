//자바의 char은 오직 한개의 글자만. 홑따옴표 안에  
public class CharDemo {
	public static void main(String[] args) {
		char grade = 'B';
		System.out.println("grade =" +grade);
		char ch = '\n'; // \은 escape 를 뜻하는 거. 문자로 보지않기에 상관x  pdf에 \활용법 나와있음  특수문자라 출력되지는 않고 그 기능이 나타남. 
		System.out.println("ch = "+ch);
		ch='C';
		System.out.println("ch="+ch);
		
		System.out.printf("%c",65); // char 출력할때는 %c  65를 char로 찍어 
		System.out.printf("%c",65+1);
		System.out.printf("%c",'\n');
		char ch1 ='C';
		System.out.printf("%c",ch1);
		System.out.printf("%c",ch1 +1);
		System.out.printf("%c", '\b');
		System.out.printf("%c\n",'E');
		
		char ch2 = '\uCAFE';  //유니코드 로 된 한글 글자다. 
		System.out.println("ch="+ch2);
				
	}
	
	
}
