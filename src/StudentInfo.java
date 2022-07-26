import java.util.Scanner;
public class StudentInfo {
	public static void main(String[] args) {	//프로그램의 시작과 끝   이게 없으면 혼자서 실행이 안됨. 없으면 부품일 뿐.
		Scanner sc = new Scanner(System.in); // new 로 변수를 설정해주는것.  git init 과 같은 거  초기화. sysin 은 표준입력. 키보드에서 입력하겠다는거. 
											// sc 스캐너를 통해서 한줄 다를 읽어서 , 즉 오른쪽에 입력한걸 왼쪽에 넣겠다. 
		
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();		// 키보드 입력받은걸 name이란 변수에 넣을꺼야. 
		
		System.out.print("학번 : ");
		String hakbun = sc.nextLine();
		
		System.out.print("주소 : ");
		String adress = sc.nextLine();	// 주소를 키보드로 입력받은걸 어드레스라는 변수에 넣겠다. 
		
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+hakbun);
		System.out.println("주소 : "+adress); 	//저장하면 깃 스테이지에 있는 워킹디렉토리에 하나가 뜬다. 이건 바로 커밋푸시 해도 된다. 이미 연결되있기 떄문에.
		
//		해당 라인 주석처리는 ctrl+ /  
//		여러 줄 하려면 여러줄 드래그해서 ctrl+shift+/     : 단점은 코드줄이나 위치가 바뀔수가 있다; 
		
//		과제 제출 유의사항 주석으로 4가지 필수 기재 
		/*
		 * Author : 누가
		 *  When : 언제 
		 *  Objectives : 목적 
		 *  Environment : 작성환경 ( OS(Windows 10 ), OpenJDK version(11.0.16), Editor(eclipse 2022-6) )
		 */	}
}
