package db;

import java.util.ArrayList;
import java.util.List;

import entity.Users;

public class Data {
	private static List<Users> list = new ArrayList<Users>();
	static{
		for (int i = 0; i < 16; i++) {
			Users users = new Users();
			users.setId(i);
			users.setName("name"+i);
			users.setSex("sex"+i);
			list.add(users);
		}
	}
	/**
	 * 
	 * @param pageNum 页码
	 * @param pageSize 每页的大小
	 * @return
	 */
	public static List<Users> getUsersByPageNum(int pageNum,int pageSize){
		//"select * from users limit ,5"
		List<Users> list2 = new ArrayList<Users>(); //1  5  0  5 5 10 
		int limit =(pageNum*pageSize>(list.size()))?(list.size()):pageNum*pageSize;
		for (int i = (pageNum-1)*pageSize; i< limit; i++) {
			 list2.add(list.get(i));
		}
		return list2;
	}
	/**
	 * 获取一共分几页
	 * @param pageSize 每页的大小
	 * @return
	 */
	public static int getPageCount(int pageSize){
		return (list.size()-1)/pageSize+1;
	}
	
}
