package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.DemoData;
import com.example.demo.model.DemoModel;

@RestController
@RequestMapping("/")
public class DemoController {
	@Autowired
	private DemoData repo;
	
	@Bean
	@GetMapping(value = "/getdata")
	public Iterable<DemoModel> getData() {
		return repo.findAll();
	}
}
