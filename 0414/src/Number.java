import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�Է� : ");
		int a=sc.nextInt();
		int c=0;
		for(int i=0;i<10;i++) {
			int b = (int)(Math.random()*50+1);
			System.out.print(b+" ");
			if(a==b) {
				c=1;
			}
		}
		if(c==1) {
			System.out.println("\n ����");
		}else {
			System.out.println("\n Ʋ����");
		}
	}
}
