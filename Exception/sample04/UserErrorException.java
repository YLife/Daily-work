package sample04;

public class UserErrorException extends Exception {

	public UserErrorException() {
		super("用户名不正确");
	}
}
