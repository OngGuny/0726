import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String munja = sc.nextLine(); //"A" A를치면 A가 저장됨 이걸 char로 어떻게 바꾸나? 
		/*String -> Char 로 바꾸기 
		 * 11 API가서 java lang -string - 가서 맨앞, type이 char인 변환기능을찾는다
		 * charAt
		 * Index  글자의 순서 
		 * Hello
		 * 0 1 2 3 4 5 번째 글자들이다. 
		 * 
		 */
		char ch = munja.charAt(0); // "A" 산출됨 
		System.out.printf("문자 %c의 코드값은%d입니다.",ch,(int)(ch));
	}
}
