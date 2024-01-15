import java.util.Scanner;

public class Exo2et3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x % y == 0) {
			System.out.println(x+" est un multiple de  "+y);
		} else {
			System.out.println(x+" n'est pas un multiple de "+y);
		}
		sc.close();
	}

}
