import javax.swing.*;
import java.util.Scanner;
public class Fibonaci {
public static void main (String [] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("input :");
	 int x=0, y=1,deretfibonaci=scan.nextInt();
	 for(int i=1; i<=deretfibonaci; i++) {
		System.out.println("fibonacci :" +x );
		y=x-y;
		x=x+y;
		
	
		}
	}
}
