import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1:����  2:����  3:��]");
		
		int user = scan.nextInt();
		int com = (int)(Math.random()*3+1);
		
		Game(user,com);
	}
	
	public static void Game(int user, int com){
		switch(user){
		case 1: System.out.print("[��: ����!] VS");break;
		case 2: System.out.print("[��: ����!] VS");break;
		case 3: System.out.print("[��: ��!] VS");break;
		}
		switch(com){
		case 1: System.out.println("[��ǻ��: ����!]");break;
		case 2: System.out.println("[��ǻ��: ����!]");break;
		case 3: System.out.println("[��ǻ��: ��!]");break;
		}
		
		if(user == 1){
			if(com == 1){
				System.out.println("���º�...");
			}
			else if(com == 2){
				System.out.println("��ǻ�� ��!!!");
			}
			else if(com == 3){
				System.out.println("����� ��!!!");
			}
		}
		else if(user == 2){
			if(com == 1){
				System.out.println("����� ��!!!");
			}
			else if(com == 2){
				System.out.println("���º�...");
			}
			else if(com == 3){
				System.out.println("��ǻ�� ��!!!");
			}
		}
		else if(user == 3){
			if(com == 1){
				System.out.println("��ǻ�� ��!!!");
			}
			else if(com == 2){
				System.out.println("���º�...");
			}
			else if(com == 3){
				System.out.println("����� ��!!!");
			}
		}
			
		}
	}