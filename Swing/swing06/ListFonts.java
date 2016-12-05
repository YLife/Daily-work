package swing06;

import java.awt.GraphicsEnvironment;

public class ListFonts {
	public static void main(String[] args) {
		String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		int count=0;
		for (String element : fontNames) {
			count++;
			System.out.println(element);
		}
		System.out.println(count);
	}
}
