package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.DemoModel;

@Service
@Repository
public interface DemoData extends CrudRepository<DemoModel, Integer> {

	
	
}
