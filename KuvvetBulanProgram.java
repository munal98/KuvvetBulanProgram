import java.util.Iterator;
import java.util.Scanner;

public class KuvvetBulanProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N değerini Giriniz : ");
		int n = sc.nextInt();
		
		System.out.print("K Değerini Giriniz : ");
		int k = sc.nextInt();
		
		// i =1 ; i*=n;
	    for (int i = 1; i <= k; i *=n) {
			System.out.println(i);
			
		}

	}

}
