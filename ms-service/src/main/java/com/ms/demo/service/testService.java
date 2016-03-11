package com.ms.demo.service;

/**
 * Created by sunyehong on 16/3/11.
 */
import com.ms.demo.dao.testDao;
import com.ms.demo.model.ziroomMap;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Package: ${PACKAGE_NAME}
 * Author: mac
 * Date: 16/2/29
 */

@Service
public class testService {

    @Autowired
    private testDao testdao;

    public ziroomMap getUser(int userId){

        return testdao.getUser(userId);
    }

}
