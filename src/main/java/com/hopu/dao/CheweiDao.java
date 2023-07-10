package com.hopu.dao;

import com.hopu.entity.Chewei;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CheweiDao {
    @Select("select * from chewei")
    List<Chewei> cheweiList();

    @Insert("insert into chewei values(#{id}, #{photo}, #{type}, 0)")
    int addChewei(Chewei chewei);
}
