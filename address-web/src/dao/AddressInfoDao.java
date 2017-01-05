package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entity.AddressInfo;

public class AddressInfoDao extends BaseDao implements
		EntityResultSetMapping<AddressInfo> {

	@Override
	public AddressInfo mapping(ResultSet rs) throws SQLException {
		return new AddressInfo(rs.getInt("id"), rs.getString("name"),
				rs.getString("phone"));
	}

	public int save(AddressInfo info) {
		String sql = "insert into addressInfo(`name`,phone) values(?,?)";
		return super.executeUpdate(sql, info.getName(), info.getPhone());

	}

	public int del(int id) {
		String sql = "delete from addressInfo where id=?";
		return super.executeUpdate(sql, id);

	}

	public int update(AddressInfo info) {
		String sql = "update addressInfo set name=?,phone=? where id=?";
		return super.executeUpdate(sql, info.getName(), info.getPhone(),
				info.getId());

	}

	public List<AddressInfo> page(int pageNo, int pageSize) {
		String sql = "select * from addressInfo limit ?,?";
		return super.executeQuery(this, sql, (pageNo - 1) * pageSize, pageSize);
	}

	public List<AddressInfo> list() {
		String sql = "select * from addressInfo";
		return super.executeQuery(this, sql);

	}

	public AddressInfo findById(int id) {
		String sql = "select * from addressInfo where id = ?";
		List<AddressInfo> list = super.executeQuery(this, sql, id);
		return list.size() > 0 ? list.get(0) : null;
	}

}
