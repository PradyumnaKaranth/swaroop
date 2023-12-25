package com.example.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mytable")
public class DbModel {
	@Id
	@Column(name="t_id")
	private String t_id;
	public String getT_id() {
		return t_id;
	}
	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_loc() {
		return t_loc;
	}
	public void setT_loc(String t_loc) {
		this.t_loc = t_loc;
	}
	public String getT_ph() {
		return t_ph;
	}
	public void setT_ph(String t_ph) {
		this.t_ph = t_ph;
	}
	public DbModel() {
		super();
	}
	public DbModel(String t_id, String t_name, String t_loc, String t_ph) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_loc = t_loc;
		this.t_ph = t_ph;
	}
	@Column(name="t_name")
	private String t_name;
	@Column(name="t_loc")
	private String t_loc;
	@Column(name="t_ph")
	private String t_ph;

}
