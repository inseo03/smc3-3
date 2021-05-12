import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int max =0;
		int maxnum =0;
		 Scanner sc =new Scanner(System.in);
		 for(int i=0; i<5; i++){
			 System.out.println((i+1)+"번 입력:");
			 arr[i]=sc.nextInt ();
			if(arr[i]>max){
				max=arr[i];
				maxnum=i+1;
		 }
	
		 }
	System.out.println("가장 큰 수는 "+maxnum+"번째 숫자인"+max+"입니다.");
	}
}
