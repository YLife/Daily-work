package test;

import interfaces.ICommandStringable;
import interfaces.Inetwork;
import interfaces.impl.*;;
public class Test {
	public static void main(String[] args) {
		Renderable render = new Renderable();
		ICommandStringable iCommandStringable = new CommandStringable();
		Inetwork inetwork = new Network();
		render.setiCommandStringable(iCommandStringable);
		render.setInetwork(inetwork);
		render.insertCard();
	}
}
