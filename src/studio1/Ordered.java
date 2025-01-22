package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
<<<<<<< HEAD
		boolean isOrdered = x < y && y < z || x > y && y > z;
		System.out.print(isOrdered);
=======
		boolean is0rdered = x < y && y < z || x > y && y > z;
		System.out.print(is0rdered);

>>>>>>> branch 'main' of https://github.com/CSE131SP25/studio-1-vakkalagaddamillerbongiorno-studio1
	}

}
