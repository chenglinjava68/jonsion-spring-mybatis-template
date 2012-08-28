package com.jonsion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jonsion.domain.Account;

public interface AccountMapper extends SqlMapper {
	/** 
	* 添加 
	* 
	* @param account 
	*            实体 
	* @throws Exception 
	*             抛出异常 
	*/ 
	@Insert("insert into users values(seq_user_id.nextval,#{userName},#{userPassword})") 
	public void add(Account account) throws Exception; 

	/** 
	* 修改 
	* 
	* @param classMethod 
	*            mybatis配置文件里面对应的命名空间+要执行的sql语句id 
	* @param entity 
	*            封装数据的实体 
	* @return 返回操作结果 
	* @throws Exception 
	*             抛出所有异常 
	*/ 
	@Update("update users set userName=#{userName},userPassword=#{userPassword} where userId=#{userId}") 
	public void edit(Account account) throws Exception; 

	/** 
	* 删除 
	* 
	* @param entity 
	*            封装数据的实体 
	* @return 返回操作结果 
	* @throws Exception 
	*             抛出所有异常 
	*/ 
	@Delete("delete from users where userId=#{userId}") 
	public void remvoe(Account account) throws Exception; 

	/** 
	* 以id为条件查找对象 
	* 
	* @param entity 
	*            封装数据的实体 
	* @return 返回查询结果 
	* @throws Exception 
	*             抛出所有异常 
	*/ 
	@Select("select t.userId,t.userName,t.userPassword from users t where t.userId=#{userId}") 
	public Account get(Account account) throws Exception; 

	/** 
	* 查询 
	* 
	* @param entity 
	*            封装数据的实体 
	* @return 返回查询结果 
	* @throws Exception 
	*             抛出所有异常 
	*/ 
	@Select("select * from(select a.*,rownum r from(select t.userId userId,t.userName userName,t.userPassword userPassword from users t)a ) where r > #{startRow} and rownum <= #{pageSize}") 
	public List<Account> getAllList(Account account) throws Exception; 

	/** 
	* 查询数量 
	* 
	* @param entity 
	*            封装数据的实体 
	* @return 返回查询结果 
	* @throws Exception 
	*             抛出所有异常 
	*/ 
	@Select("select count(1)from users") 
	public int getCount(Account account) throws Exception; 
}
