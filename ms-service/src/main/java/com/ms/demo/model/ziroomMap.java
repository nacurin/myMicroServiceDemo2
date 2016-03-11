package com.ms.demo.model;

/**
 * Created by sunyehong on 16/3/11.
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 绘制板块主表表
 *
 * @author ouyang code generate
 * @since 2015-03-09
 */
@SuppressWarnings("UnusedDeclaration")
public class ziroomMap implements Serializable{

    private int id;

    private String areaName;

    private String directorName;

    private String disctrictName;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getDisctrictName() {
        return disctrictName;
    }

    public void setDisctrictName(String disctrictName) {
        this.disctrictName = disctrictName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}