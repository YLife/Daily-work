package operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	private List<Book> list = null;
	Scanner sc= new Scanner(System.in);
	public void init(){
		list = new ArrayList<>();
		list.add(new Book("1111", "Java核心技术", Book.NOT_LEND));
		list.add(new Book("2222", "Think in Java", Book.NOT_LEND));
		list.add(new Book("3333", "Java初级教程", Book.NOT_LEND));
	}
	
	/**
	 * 显示系统菜单
	 */
	public void showMenu(){
		System.out.println("---------------------------------------- ");
		System.out.println("\t\t       菜单                                                                    ");
		System.out.println("   1.显示                                                                2.搜索       ");
		System.out.println("   3.借书                                                                4.还书       ");
		System.out.println("                 5.退出                                                 ");
		System.out.println("----------------------------------------- ");
		System.out.println("请选择：");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			view();
			showMenu();
			break;
		case 2:
			System.out.println("请输入需要检索的图书名称：");
			sc.skip("\r\n");
			String name = sc.nextLine();
			search(name);
			showMenu();
			break;
		case 3:
			lend();
			showMenu();
			break;
		case 4:
			giveBack();
			showMenu();
			break;
		case 5:
			System.exit(0);
		default:
			break;
		}
	}
	
	/**
	 * 显示图书信息列表
	 */
	public void view(){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNumber()+", "+list.get(i).getName()+", "+list.get(i).getState());
		}
	}
	
	/**
	 * 搜索图书
	 * @param name
	 * @return
	 */
	public Book search(String name){
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)==null) {
				continue;
			}
			if (name.equalsIgnoreCase(list.get(i).getName())) {
				System.out.println("有这本书！");
				return list.get(i);
			}
		}
		return null;
	}
	
	/**
	 * 借书
	 */
	public void lend(){
		System.out.println("请输入借阅书籍的名称：");
		sc.skip("\r\n");
		String name = sc.nextLine();
		Book book = search(name);
		if (book==null) {
			System.out.println("该图书还没上架！");
		}else {
			if (book.getState().equals(Book.LEND)) {
				System.out.println("该图书已借出！");
			}else {
				book.setState(Book.LEND);
				System.out.println("借书成功！");
			}	
		}
		
	}
	
	/**
	 * 还书
	 */
	public void giveBack(){
		System.out.println("请输入要还的书名：");
		sc.skip("\r\n");
		String name = sc.nextLine();
		Book book = search(name);
		if (book.getState().equals(Book.LEND)) {
			book.setState(Book.NOT_LEND);			
		}
		System.out.println("还书成功！");
	}
}
