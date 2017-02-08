package com.yl.dao;

import java.sql.ResultSet;

public interface ResultMapper<E> {
	E resultMapping(ResultSet rs);
}
