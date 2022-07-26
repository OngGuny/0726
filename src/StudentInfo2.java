
public class StudentInfo2 {
public static void main(String[] args) {
	Student chulsu = new Student();							//Student[데이터 타입, 정수형이 아닌거=참조형 ] chulsu[메모리 주소] 여기서 new를 하면 어디인지는 모르나 메모리상에서 student를 만듦 
	/*타입		주소		설계	설계도 
	 * 		주소에 왔더니 방이 5개가 있음 
	 */
	chulsu.name ="김철수";
	/* name 방에는 김철수가 들어가있음. 스트링이니까 문자만 가능  문자니까 ""사용 
	 */
	chulsu.hakbun = "2022-222";
	chulsu.kor = 80;
	chulsu.eng = 100;
	chulsu.mat = 85;
	int total = 	chulsu.kor +chulsu.eng+ chulsu.mat	;			//밑에 다 더하려니까 너무 길다. 그러니 토탈을 하나 만듦.
	//System.out.println("총점 : "+(chulsu.kor+chulsu.eng+chulsu.mat));
	double avg = total / 3.0; // double을 쓰려면 항들 중에 실수가 하나 이상 있어야함 
	 System.out.printf("총점 : %d\n", total);
	 System.out.println("평균 : "+avg); 
	
	
	
}
}

class Student{	//객체의 설계도  		
	String name;	//멤버, Field
	String hakbun;
	int kor;
	int eng;
	int mat;
// 이 클래스는 메인이 없어서 누가 불러줘야함. 부품임. Component 	
}
//자바의 룰: 하나의 자바 파일 안에는 public class는 하나밖에 못만듦. main이 있는 클래스가 public이 되야하고 이 클래스의 이름으로 파일이 저장된다. 
// 여기서 만든건 이 프로젝트 안에서 만든 클래스라면 참조해서 쓸수 있다. 



// 위의 클래스인포2에서 밑의 클래스 student를 참조하려고 만듦. 기존 자바에는 없는 거.
// 이 student는 설계하는것.  학생이라면 이름이 있고, 학번이 있고, 국어를 하고 영어를하고 수학을 한다. 는느낌.
// 학생이라는 객체를 모델링하면 클래스라는 설계도가 되고 메모리에 설계도 대로 만들면 instance 가 되는거 
// 스캐너에서 객체를 올릴때 new를 썻으니 여기서도 new를 써서 올려준다. 
