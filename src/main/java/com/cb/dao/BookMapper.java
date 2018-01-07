package com.cb.dao;

import com.cb.pojo.Book;

public interface BookMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}