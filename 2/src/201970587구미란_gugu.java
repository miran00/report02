import java.util.Scanner;

public class 201970587구미란_gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		int input =1;
		
		System.out.println("¸î´ÜÀ» Ãâ·ÂÇÒ±î¿ä? : ");
		int dan = Scan.nextInt();
		
		for(int i=1; i<10; i++) {
			input = dan * i;
			System.out.println(dan+"x"+i+"="+input);
		}
	}

}
