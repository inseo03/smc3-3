import java.util.Random; 
import java.util.Scanner;
                           
public class Game {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);   
		System.out.print("가위바위보 게임을 시작합니다.\n가위(1),바위(2),보(3),끝내기(4)");
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
			System.out.print("사용자는:"+num);
			System.out.print("컴퓨터는:"+comN);
			System.out.println("비겼습니다.");
		}else if(num==1 && comN==2||num==2 && comN==3||num==3 && comN==1) {
			System.out.print("사용자는:"+num);
			System.out.print("컴퓨터는:"+comN);
			System.out.println("졌습니다.");
		}else if(num==1 && comN==3||num==2 && comN==1||num==3 && comN==2) {
			System.out.println("사용자는: "+num);
			System.out.println("컴퓨터는: "+comN);
			System.out.println("이겼습니다.");
		}else if(num==4) {
			System.out.println("종료됩니다.");
		}
	}
}