package com.dongguk.bus;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class PredictDAO {
	private SqlSessionFactory sqlSessionFactory;
	public PredictDAO(){
	}

	public List<Account> selectAll(){
		SqlSession session = sqlSessionFactory.openSession();

		try 
		{
			return session.selectList("sqlMapper.selectAll");
		}
		finally
		{
			session.close();
		}
	}
	
	
}
