package com.zxg.service;

import java.util.List;

import com.zxg.entity.Admin;

public interface AdminService {

	public void insert(Admin admin);

	public Admin findbyid(int id);

	public List<Admin> findall();

	public void delete(int id);

	public void update(Admin admin);
}
