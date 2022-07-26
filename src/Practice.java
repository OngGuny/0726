import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Student Jimin = new Student();
		Scanner sc = new Scanner(System.in);
//		Jimin.hakbun = "2022-005";
//		Jimin.name = "박지민";
//		Jimin.kor = 90;
//		Jimin.eng = 100;
//		Jimin.mat = 85;   이것들을 키보드로 받겠다는거. 저장을 지민클래스에 해야지. 
		 
		
		System.out.print("학번 : ");
		Jimin.hakbun = sc.nextLine();
		
		System.out.print("이름 : ");
		Jimin.name = sc.nextLine();
		
		System.out.print("국어 : ");
		Jimin.kor = sc.nextInt();
		
		System.out.print("영어 : ");
		Jimin.eng = sc.nextInt();
		
		System.out.print("수학 : ");
		Jimin.mat = sc.nextInt();
		
		int total = Jimin.kor+Jimin.mat+Jimin.eng;
//		System.out.println("총점 : "+total);
		
		double avg = total / 3.0;
//		System.out.printf("평균 : "+avg);
		
		System.out.printf("학번 :%s\n ",Jimin.hakbun);
		System.out.printf("이름 :%s \n",Jimin.name);
		System.out.printf("국어 :%d\n ",Jimin.kor);
		System.out.printf("영어 :%d\n ",Jimin.eng);
		System.out.printf("수학 :%d\n ",Jimin.mat);
		System.out.printf("총점 :%d \n",total);
		System.out.printf("평균 :%.2f \n",avg);
		
				
	}

}

// 입력하고 출력하는 것 까지. 출력해서 해야 완료

// class는 스튜인포2에 만들어 놨기 때문에 구지 새로 안써도 된다. 거기꺼 알아서 참조됨 


