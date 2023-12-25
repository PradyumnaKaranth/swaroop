package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Model.DbModel;
import com.example.Repository.DbRepository;
@Service
public class DbServiceimpl implements DbService {
	DbRepository dbrepo;

	public DbServiceimpl(DbRepository dbrepo) {
		super();
		this.dbrepo = dbrepo;
	}
	@Override
	public List<DbModel> getDbDetails() {
		return dbrepo.findAll();
	
	}

}
