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

//Dao가 갖춰야할것은 SqlSessionFactory

public class PredictDAO {
	private SqlSessionFactory sqlSessionFactory;
	public PredictDAO(){
	}

	public List<Account> selectAll(){
		SqlSession session = sqlSessionFactory.openSession();

		try 
		{
			// 여기로 가서 처리해라
			return session.selectList("sqlMapper.selectAll");
		}
		finally
		{
			session.close();
		}
	}
	
	
}