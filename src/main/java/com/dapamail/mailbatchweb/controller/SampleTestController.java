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
	private MovieDao movieDao;

	@GetMapping("/foo")
	public List<Movie> foo() {
		return movieDao.getList();
	}
	
	@GetMapping("/boo")
	@Scheduled(fixedDelay = 2000L)
	public void addList() {
		movieDao.addList();
	}
}
