package operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	private List<Book> list = null;
	Scanner sc= new Scanner(System.in);
	public void init(){
		list = new ArrayList<>();
		list.add(new Book("1111", "Java���ļ���", Book.NOT_LEND));
		list.add(new Book("2222", "Think in Java", Book.NOT_LEND));
		list.add(new Book("3333", "Java�����̳�", Book.NOT_LEND));
	}
	
	/**
	 * ��ʾϵͳ�˵�
	 */
	public void showMenu(){
		System.out.println("---------------------------------------- ");
		System.out.println("\t\t       �˵�                                                                    ");
		System.out.println("   1.��ʾ                                                                2.����       ");
		System.out.println("   3.����                                                                4.����       ");
		System.out.println("                 5.�˳�                                                 ");
		System.out.println("----------------------------------------- ");
		System.out.println("��ѡ��");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			view();
			showMenu();
			break;
		case 2:
			System.out.println("��������Ҫ������ͼ�����ƣ�");
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
	 * ��ʾͼ����Ϣ�б�
	 */
	public void view(){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNumber()+", "+list.get(i).getName()+", "+list.get(i).getState());
		}
	}
	
	/**
	 * ����ͼ��
	 * @param name
	 * @return
	 */
	public Book search(String name){
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)==null) {
				continue;
			}
			if (name.equalsIgnoreCase(list.get(i).getName())) {
				System.out.println("���Ȿ�飡");
				return list.get(i);
			}
		}
		return null;
	}
	
	/**
	 * ����
	 */
	public void lend(){
		System.out.println("����������鼮�����ƣ�");
		sc.skip("\r\n");
		String name = sc.nextLine();
		Book book = search(name);
		if (book==null) {
			System.out.println("��ͼ�黹û�ϼܣ�");
		}else {
			if (book.getState().equals(Book.LEND)) {
				System.out.println("��ͼ���ѽ����");
			}else {
				book.setState(Book.LEND);
				System.out.println("����ɹ���");
			}	
		}
		
	}
	
	/**
	 * ����
	 */
	public void giveBack(){
		System.out.println("������Ҫ����������");
		sc.skip("\r\n");
		String name = sc.nextLine();
		Book book = search(name);
		if (book.getState().equals(Book.LEND)) {
			book.setState(Book.NOT_LEND);			
		}
		System.out.println("����ɹ���");
	}
}
