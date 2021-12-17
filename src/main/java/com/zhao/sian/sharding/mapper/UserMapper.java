package com.zhao.sian.sharding.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zhao.sian.sharding.domain.UserModel;

public interface UserMapper {
    
    /** 如果是主键自动生成的，切记不要传入id，否则会报错 */
    @Insert("insert into t_user(name,age) values(#{name},#{age})")
    void insert(UserModel user);


    @Select("select * from t_user")
    List<UserModel> selectAll();


    @Select("select * from t_user where name like #{name}")
    List<UserModel> selectLike(String name);


    @Select("select * from t_user where name like #{name} limit 1")
    List<UserModel> selectLikePage(String name);

}
