package com.zxg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zxg.BaseDao;
import com.zxg.entity.Admin;

/**
 * @author 张鑫国
 * @company 九江职大
 * @date 2017年10月24日
 */
public interface AdminMapper extends BaseDao<Admin> {

	@Select("select * from admin where id = #{state}")
	public Admin findbyid(Integer state);

	@Insert("INSERT INTO admin (adminname,adminpwd ,adminstate) VALUES(#{adminname},#{adminpwd},#{adminstate})")
	public int insert(Admin admin);

	@Select("select * from admin")
	public List<Admin> findall();

	@Delete("delete from admin where id=#{id}")
	public void del(int id);

	@Update("update admin set adminname=#{adminname},adminpwd=#{adminpwd},adminstate=#{adminstate} where id=#{id}")
	public void update(Admin amdin);

}