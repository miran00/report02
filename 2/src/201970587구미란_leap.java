import java.util.Scanner;

public class 201970587구미란_leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("년도 입력: ");
		
		int y = Scan.nextInt();
		
		if((y%4==0 && y%100!=0)||(y%400==0)) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("평년입니다");
		}
	}

}
