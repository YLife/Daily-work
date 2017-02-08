package com.yl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.EmpDao;
import com.yl.dao.ResultMapper;
import com.yl.entity.Dept;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpImpl extends BaseDao implements EmpDao {

	@Override
	public List<Emp> queryAll(int currentPage, int pageSize, EmpVo vo) {
		String sql = "select * from emp e left join dept d on e.deptno = d.deptno where 1=1";
		sql = setCondition(vo, sql);
		sql += " limit ? , ?";
		return super.excuteQuery(sql, rm, (currentPage - 1)*5 , pageSize);
	}

	private String setCondition(EmpVo vo, String sql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		if (vo != null) {
			if (vo.getEname() != null) {
				sql += " and e.ename like '%"+vo.getEname()+"%'";
			}
			if (vo.getDeptno() != 0) {
				sql += " and e.deptno = " + vo.getDeptno();
			}
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					sql += " and e.hireDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					sql += " and e.hireDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					sql += " and e.hireDate <= '"+sdf.format(vo.getEnd())+"'";
				}
			}
		}
		return sql;
	}

	@Override
	public Emp queryById(int id) {
		String sql = "select * from emp e where 1=1";
		List<Emp> list = super.excuteQuery(sql, rm, id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public int update(Emp emp) {
		String sql = "update emp set ename = ? , job = ? , sal = ? , comm = ? , mgr = ? , hireDate = ? , deptno = ? where empno = ?";
		return super.excuteUpdate(sql, emp.geteName() , emp.getJob() , emp.getSal() , emp.getComm() , emp.getMgr() , emp.getHireDate() , emp.getDept() , emp.getEmpNo());
	}

	@Override
	public int getCount(EmpVo vo) {
		String sql = "select * from emp e left join dept d on e.empno = d.deptno where 1=1";
		this.setCondition(vo , sql);
		List<Emp> list = super.excuteQuery(sql, rm);
		return list.size();
	}
	
	ResultMapper<Emp> rm = new ResultMapper<Emp>() {
		
		@Override
		public Emp resultMapping(ResultSet rs) {
			try {
				Emp emp = new Emp(rs.getInt("empno") , rs.getString("ename"), rs.getString("job"), rs.getDouble("sal"), rs.getDouble("comm"), rs.getInt("mgr"), rs.getDate("hireDate"), new Dept(rs.getInt("deptNo"), rs.getString("dname"), rs.getString("loc")));
				return emp;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	};
}
