import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("�⵵ �Է�: ");
		
		int y = Scan.nextInt();
		
		if((y%4==0 && y%100!=0)||(y%400==0)) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("����Դϴ�");
		}
	}

}
