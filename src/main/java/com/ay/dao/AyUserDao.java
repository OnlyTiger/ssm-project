package com.ay.dao;

import com.ay.model.AyUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ay
 * @create 2018/05/16
 **/
@Repository
public interface AyUserDao {

    @Select("select * from ay_user")
    List<AyUser> findAll();

    AyUser findById(int id);

    @Select("select * from ay_user where name = #{name}")
    AyUser findByName(String name);

    int countByName(String name);

    @Insert(" insert into ay_user(id,name,password) values (#{id}, #{name}, #{password})")
    int insert(AyUser ayUser);

    @Update("update ay_user set name =#{name}, password = #{password} where id = #{id}")
    int update(AyUser ayUser);

    @Delete(" delete from ay_user where id = #{id}")
    int delete(int id);

    int deleteByName(String name);

    List<AyUser> findByNameAndPassword(@Param("name") String name, @Param("password")String password);

    List<AyUser> findByIds(@Param("list") List<Integer> list);
}
