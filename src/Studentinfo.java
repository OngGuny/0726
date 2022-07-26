import java.util.Scanner;
public class Studentinfo {
	public static void main(String[] args) {	//프로그램의 시작과 끝   이게 없으면 혼자서 실행이 안됨. 없으면 부품일 뿐.
		Scanner sc = new Scanner(System.in); // new 로 변수를 설정해주는것.  git init 과 같은 거  초기화. sysin 은 표준입력. 키보드에서 입력하겠다는거. 
		System.out.print("오늘 날짜는? : ");
		String today = sc.nextLine();										// sc 스캐너를 통해서 한줄 다를 읽어서 , 즉 오른쪽에 입력한걸 왼쪽에 넣겠다. 
		
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();		// 키보드 입력받은걸 name이란 변수에 넣을꺼야. 
		
		System.out.print("학번 : ");
		String hakbun = sc.nextLine();
		
		System.out.println("날짜 : "+today);
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+hakbun);
	
		
		
	}
}
