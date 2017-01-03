package dao.impl.oracle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.CardInfoDao;
import dao.EntityResultSetMapping;
import dao.impl.mysql.DbUtil;
import entity.CardInfo;

public class CardInfoDaoImpl extends DbUtil implements CardInfoDao,
		EntityResultSetMapping<CardInfo> {

	@Override
	public CardInfo queryById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CardInfo> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(CardInfo entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int del(Object id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CardInfo entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CardInfo mapping(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
