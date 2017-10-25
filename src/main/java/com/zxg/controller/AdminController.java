package com.zxg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zxg.entity.Admin;
import com.zxg.service.impl.AdminServiceImpl;

/**
 * @author 张鑫国
 * @company 九江职大
 * @date 2017年10月23日
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminServiceImpl adminServiceImpl;

	@RequestMapping("/findbyid")
	public Admin findbyid(int id) {
		Admin admin = adminServiceImpl.findbyid(id);
		return admin;
	}

	@RequestMapping("/insert")
	public Admin findbyid(Admin admin) {
		adminServiceImpl.insert(admin);
		return admin;

	}

	@RequestMapping("/findall")
	public List<Admin> findbyid() {
		List<Admin> admin = adminServiceImpl.findall();
		return admin;
	}

	@RequestMapping("/delete")
	public int delete(int id) {
		adminServiceImpl.delete(id);
		return 0;
	}
	
	@RequestMapping("/update")
	public int update(Admin admin) {
		adminServiceImpl.update(admin);
		return 0;
	}
}
