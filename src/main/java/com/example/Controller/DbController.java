package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.DbModel;
import com.example.Repository.DbRepository;
import com.example.Service.DbService;

@RestController
@RequestMapping("/db")
public class DbController {
	DbService dbService;
	
	public DbController(DbService dbService) {
		super();
		this.dbService = dbService;
	}

	@GetMapping()
	public List<DbModel> getDbDetails() {
		return dbService.getDbDetails();
		
	}

}
