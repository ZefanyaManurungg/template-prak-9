import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int y = in.nextInt();
	int faktor = 1;
	in.close();
	for (int i = 1; i <= y; i++) {
		faktor = faktor * i;
		
	}
	System.out.print(faktor);
	}
}
