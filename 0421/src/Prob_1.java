import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int sum=0;
			System.out.println("시작 숫자:");
			int a;
			a=scan.nextInt();
			System.out.println("마지막 숫자:");
			int b;
			b=scan.nextInt();
			
			for(int i=a; i<=b; i++){
				sum=sum+i;
			}
	
			System.out.println(a + "부터 " + b + "까지의 합은 " +sum);
		}
}