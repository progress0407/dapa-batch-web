package com.dapamail.mailbatchweb.dao.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dapamail.mailbatchweb.dao.MovieDao;
import com.dapamail.mailbatchweb.entity.Movie;

@SpringBootTest
class MybatisMovieDaoImplTest {

	@Autowired
	private SqlSession sqlSession;
	
	private MovieDao mapper;
	
	@Test
	void testGetList() {
		mapper = sqlSession.getMapper(MovieDao.class);
		List<Movie> list = mapper.getList();
		System.out.println(list);
//		System.out.println(list.get(0));
	}
	
}
