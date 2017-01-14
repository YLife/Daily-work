package com.yl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yl.dao.EmpDao;
import com.yl.dao.ResultMapping;
import com.yl.entity.Emp;

public class EmpDaoImpl extends BaseDao implements EmpDao {

	@Override
	public List<Emp> querryEmpsByPage(Integer currentPage, Integer pageSize) {
		String sql = "select * from emp limit ? , ?";
		return super.querry(rm, sql, (currentPage - 1) * pageSize , pageSize);
	}

	@Override
	public Emp querryEmpById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	ResultMapping<Emp> rm = new ResultMapping<Emp>() {
		
		@Override
		public Emp resultMapping(ResultSet rs) {
			Emp emp = new Emp();
			try {
				emp.setComm(rs.getFloat("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setSal(rs.getFloat("sal"));
				emp.setEmpno(rs.getInt("empno"));
				return emp;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	};
}
