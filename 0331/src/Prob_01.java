import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Grade me = new Grade();
		
		System.out.print(" ����, ����, ���� ������ �ӷ��ϼ��� :");
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();
		System.out.println("����� "+me.average()+"�Դϴ�.");

	}

}
class Grade{
	 int math,science,english;
	 public int average(){
		 return(math+science+english)/3;
	 }
}