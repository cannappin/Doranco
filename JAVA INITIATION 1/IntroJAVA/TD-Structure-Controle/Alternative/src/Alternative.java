
import java.util.Scanner;

public class Alternative
{ 
  public static void main(String args[])
  {
	 Scanner sc = new Scanner(System.in);
     int nb = sc.nextInt();
     switch(nb)
     {
       case 1:
         System.out.println("Un"); //break;
       case 2:
         System.out.println("Deux"); break;
       default: 
        System.out.println("Autre nombre"); 
      }
    }
  }