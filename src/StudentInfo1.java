import java.util.Scanner;
public class StudentInfo1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("귀하의 키는? : ");
	double height = sc.nextDouble();
	
	
	System.out.print("귀하의 몸무게는? :");
	double weight = sc.nextDouble();
	
	System.out.println("키와 몸무게 : "+height+","+weight);

	
	
	System.out.print("귀하의 키는? : ");  // 위에서 만들었기 때문에 double height 라고 변수를 새로 지정할 필요가 없이 변수만 가져온다. 
	height = sc.nextDouble();
	
	
	System.out.print("귀하의 몸무게는? :");
	 weight = sc.nextDouble();
	
	
	
}
}
