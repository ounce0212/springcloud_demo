package com.example.springmvc_mybatis.dao;

import com.example.springmvc_mybatis.entity.Mo_Grade;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface GradeDao {

    @Select("select * from mo_grade")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "gradeName",column = "gradename")
    })
    List<Mo_Grade> getAll();

    @Select("select * from mo_grade where id = #{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "gradeName",column = "gradename")
    })
    Mo_Grade getGradeById(int id);

    @Insert("insert into mo_grade(gradename) values(#{gradeName})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    void addGrade(Mo_Grade mo_grade);

}
