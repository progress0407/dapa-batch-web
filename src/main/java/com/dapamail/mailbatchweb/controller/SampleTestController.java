package com.dapamail.mailbatchweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dapamail.mailbatchweb.dao.MovieDao;
import com.dapamail.mailbatchweb.entity.Movie;

@RestController
public class SampleTestController {
	
	@Autowired
	private MovieDao mapper;

	@GetMapping("/foo")
	public List<Movie> foo() {
		return mapper.getList();
	}
	
	@GetMapping("/boo")
	@Scheduled(fixedDelay = 2000L)
	public void addList() {
		mapper.addList();
	}
	
	@GetMapping("/bar")
	public void createTable() {
		mapper.createTable();
	}
}
