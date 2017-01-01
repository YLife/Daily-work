package ui;

import resquestImpl.client.ClientResquestImpl;

public class ClientTest {
	public static void main(String[] args) {
		ClientUi cu = new ClientUi();
		cu.setCr(new ClientResquestImpl());
		cu.checkAccount();
	}
}
