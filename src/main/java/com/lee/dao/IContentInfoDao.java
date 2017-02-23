package com.lee.dao;

import com.lee.entity.ContentInfo;

public interface IContentInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ContentInfo record);

    int insertSelective(ContentInfo record);

    ContentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContentInfo record);

    int updateByPrimaryKey(ContentInfo record);
}