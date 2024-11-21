package com.example.demochapter05.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demochapter05.entity.EBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<EBook> {

}
