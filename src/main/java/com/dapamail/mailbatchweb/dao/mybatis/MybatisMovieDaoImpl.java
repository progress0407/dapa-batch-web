package com.dapamail.mailbatchweb.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dapamail.mailbatchweb.dao.MovieDao;
import com.dapamail.mailbatchweb.entity.Movie;

@Repository
public class MybatisMovieDaoImpl implements MovieDao {

	private SqlSession sqlSession;
	
	private MovieDao mapper;

	@Autowired
	public MybatisMovieDaoImpl(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(MovieDao.class);
	}

	@Override
	public List<Movie> getList() {
		System.out.println("수정된 롬복"); // 글씨가 보이나용
		System.out.println("mapper" + mapper);
		return mapper.getList();
	}

	@Override
	public void addList() {
		mapper.addList();
	}

}
