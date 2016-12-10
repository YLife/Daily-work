package abstracts;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		MyBook book=new MyBook();
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		book.setTitle(s);
		System.out.println(book.getTitle());
		sc.close();
	}
}
