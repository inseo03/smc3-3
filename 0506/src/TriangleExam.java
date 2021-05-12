
public class TriangleExam {

	public static void main(String[] args) {
		double m=10.2;
		double h=17.3;
		Triangle t= new Triangle(m,h);
		System.out.println("넓이 : " + t.cal());
		System.out.println("--------------변경--------");
		
		t.change();
		System.out.println("넓이:"+t.cal());
		
		
	}

}
class Triangle{
double h;
double m;
	Triangle(){
		
	}
	Triangle(double m,double h){
		this.h =h;
		this.m=m;
	}
	
	double cal(){
		return m*h/2;
	}
	
	void change(){
		m = 7.5;
		h = 9.2;
	}
}