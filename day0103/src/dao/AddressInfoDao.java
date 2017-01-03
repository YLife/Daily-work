package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entity.AddressInfo;

public class AddressInfoDao extends BaseDao implements EntityResultSetMapping<AddressInfo> {

	@Override
	public AddressInfo mapping(ResultSet rs) throws SQLException {
		return new AddressInfo(rs.getInt("id"), rs.getString("name"), rs.getString("phone"));
	}
	
	public int save(AddressInfo info){
		String sql = "insert into contact(id , name , phone) values(? , ? , ?)";
		return super.excuteUpdate(sql , info.getName() , info.getPhone());
	}
	
	public int del(int id){
		String sql = "delete from contact where id = ?";
		return super.excuteUpdate(sql, id);
	}
	
	public int update(AddressInfo info){
		String sql = "update contact set name = ? , phone = ? where id = ?";
		return super.excuteUpdate(sql, info.getName() , info.getPhone() , info.getId());
	}
	
	public List<AddressInfo> list(){
		String sql = "select * from contact";
		return super.excuteQuery(this , sql);
	}
	
	public AddressInfo findById(int id){
		String sql = "select * from contact where id = ?";
		List<AddressInfo> list = super.excuteQuery(this , sql , id);
		return list.size() > 0 ? list.get(0) : null;
	}
}
