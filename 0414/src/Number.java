import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ÀÔ·Â : ");
		int a=sc.nextInt();    //입력받기
		int c=0;  //랜덤숫자중 같은것이 있는지 알려주는 변수
		for(int i=0;i<10;i++) {
			int b = (int)(Math.random()*50+1);        //랜덤값 50까지
			System.out.print(b+" ");
			if(a==b) {       // 맞은게 있으면 c 를 1로 선언
				c=1;
			}
		}
		if(c==1) {
			System.out.println("\n Á¤´ä");    //맞아서 출력
		}else {
			System.out.println("\n Æ²·ÈÀ½");   //틀려서 틀렸다고 출력
		}
	}
}
