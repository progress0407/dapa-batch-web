package com.dapamail.mailbatchweb.dao;

import java.util.List;

import com.dapamail.mailbatchweb.entity.Movie;

public interface MovieDao {
	
	List<Movie> getList();
	
	void addList();
	
	void createTable();
	
}
