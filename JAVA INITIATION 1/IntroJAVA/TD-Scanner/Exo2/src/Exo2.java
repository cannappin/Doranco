
public class Exo2 {

	public static void main(String[] args) {
		int a= 10002;
		int b = 12;
		int storage = a;
		
		a = b;
		b = storage;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
