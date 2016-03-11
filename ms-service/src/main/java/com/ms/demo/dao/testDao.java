package com.ms.demo.dao;

/**
 * Created by sunyehong on 16/3/11.
 */

import com.ms.demo.model.ziroomMap;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface testDao {

    @Select("SELECT * FROM ziroomMap WHERE Id = #{userId}")
    ziroomMap getUser(long userId);
}
