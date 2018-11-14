package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface AccountDao {
    @Select("select *from Account")
    public List<Account> findAll();
    @Insert("insert into Account (name,money) value(#{name},#{money})")
    public void  saveAccount(Account account);
}
