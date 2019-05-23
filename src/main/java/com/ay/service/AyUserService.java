package com.ay.service;

import com.ay.model.AyUser;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author Ay
 * @create 2018/05/16
 **/
public interface AyUserService {

    List<AyUser> findAll();
}
