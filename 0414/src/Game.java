import java.util.Random; 
import java.util.Scanner;
                           
public class Game {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);   
		System.out.print("���������� ������ �����մϴ�.\n����(1),����(2),��(3),������(4)");
		String a=s.next(); 
		int comN=(int)(Math.random()*4);  
		int num=0;
		
		switch (a) {
		case "1":
			num=1;
			break;
		case "2":
			num=2;
			break;
		case "3":
			num=3;
			break;
			
		case "4":
			num=4;
			break;
		}
		if(num==1 && comN==1||num==2 && comN==2||num==3 && comN==3) {
			System.out.print("����ڴ�:"+num);
			System.out.print("��ǻ�ʹ�:"+comN);
			System.out.println("�����ϴ�.");
		}else if(num==1 && comN==2||num==2 && comN==3||num==3 && comN==1) {
			System.out.print("����ڴ�:"+num);
			System.out.print("��ǻ�ʹ�:"+comN);
			System.out.println("�����ϴ�.");
		}else if(num==1 && comN==3||num==2 && comN==1||num==3 && comN==2) {
			System.out.println("����ڴ�: "+num);
			System.out.println("��ǻ�ʹ�: "+comN);
			System.out.println("�̰���ϴ�.");
		}else if(num==4) {
			System.out.println("����˴ϴ�.");
		}
	}
}