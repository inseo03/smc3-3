import java.util.Scanner;
public class CircleExam {
	public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);  
		 int radius=0;
		 System.out.print("반지름 값 >>");
		 radius=sc.nextInt (); // 입력받은 반지름 값 radius 변수에 넣기

		 Circle c = new Circle(radius);//  Circle 클래스를 통해 객체 c생성
 
		 System.out.println("반지름 "+ radius + "인 원의 넓이는 " + c.Area() + "이다.");  
	}
}

class Circle{
	int radius;
	public Circle(int radius) { 

		this.radius=radius;

	}
	public double Area() {   
		
		return (radius*radius*3.14);
	}
}