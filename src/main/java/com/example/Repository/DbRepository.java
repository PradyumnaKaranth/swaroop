package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.DbModel;

public interface DbRepository extends JpaRepository<DbModel, String> {

}
