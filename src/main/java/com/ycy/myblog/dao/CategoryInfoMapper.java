package com.ycy.myblog.dao;

import com.ycy.myblog.bean.CategoryInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryInfoMapper {

    int deleteByPrimaryKey(Integer categoryId);


    int insert(CategoryInfo record);


    int insertSelective(CategoryInfo record);


    CategoryInfo selectByPrimaryKey(Integer categoryId);


    int updateByPrimaryKeySelective(CategoryInfo record);


    int updateByPrimaryKey(CategoryInfo record);

    List<CategoryInfo> getCateList();
}