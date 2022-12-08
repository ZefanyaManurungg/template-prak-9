import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();

		for (int i = 1; i <= 10; i++){
			System.out.println(i + " x " + y + " = " + i * y);
		}
		
	}
}
