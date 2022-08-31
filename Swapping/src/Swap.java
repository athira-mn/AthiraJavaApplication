import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x and y");
		x = sc.nextlnt();
		y = sc.nextlnt();
		System.out.println("before swapping numbers:"+x+" "+y);
		t = x;
		x = y;
		y = t;
		System.out.println("After swapping:" +x+" "+y);
		System.out.println();

	}

}
