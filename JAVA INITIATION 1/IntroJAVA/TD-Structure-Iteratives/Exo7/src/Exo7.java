import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\users\\admin\\Lorem.txt"));
			Scanner sc = new Scanner(fis);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
