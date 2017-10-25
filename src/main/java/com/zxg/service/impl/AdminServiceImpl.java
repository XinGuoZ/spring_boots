package com.zxg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxg.mapper.AdminMapper;
import com.zxg.entity.Admin;
import com.zxg.service.AdminService;

/**
 * @author 张鑫国
 * @company 九江职大
 * @date 2017年10月24日
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;

	@Override
	public void insert(Admin admin) {
		// TODO Auto-generated method stub
		adminMapper.insert(admin);
	}

	@Override
	public Admin findbyid(int id) {
		// TODO Auto-generated method stub
		return adminMapper.findbyid(id);

	}

	@Override
	public List<Admin> findall() {
		return adminMapper.findall();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		adminMapper.del(id);

	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		adminMapper.update(admin);
	}

}
