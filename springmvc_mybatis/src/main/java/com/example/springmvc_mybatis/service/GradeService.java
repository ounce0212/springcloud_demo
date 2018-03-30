package com.example.springmvc_mybatis.service;

import com.example.springmvc_mybatis.dao.GradeDao;
import com.example.springmvc_mybatis.entity.Mo_Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public List<Mo_Grade> getAll() {

//        Mo_Grade mo_grade = new Mo_Grade();
//        mo_grade.setGradeName("测试1");
//        gradeDao.addGrade(mo_grade);
//
//        int b = Integer.valueOf("sfs33sf");
//
//        mo_grade.setGradeName("测试2");
//        gradeDao.addGrade(mo_grade);

        return gradeDao.getAll();
    }

}
