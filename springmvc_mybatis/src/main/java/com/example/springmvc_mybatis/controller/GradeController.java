package com.example.springmvc_mybatis.controller;

import com.example.springmvc_mybatis.dao.GradeDao;
import com.example.springmvc_mybatis.entity.Mo_Grade;
import com.example.springmvc_mybatis.service.GradeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/grade")
@RestController
public class GradeController {

    @Autowired
    private GradeDao gradeDao;

    @Autowired
    private GradeService gradeService;

    @GetMapping("/all/{page}")
    public Page getAll(@PathVariable(required = false) int page){

        Page<Mo_Grade> pageInfo = PageHelper.startPage(page,15);
        //gradeDao.getAll();
        gradeService.getAll();

        return pageInfo;
    }

    @GetMapping("/get/{id}")
    public Mo_Grade getGradeById(@PathVariable int id){
        return gradeDao.getGradeById(id);
    }

    @GetMapping("/add/{gradeName}")
    public Mo_Grade getGradeById(@PathVariable String gradeName){

        Mo_Grade mo_Grade = new Mo_Grade();
        mo_Grade.setGradeName(gradeName);
        gradeDao.addGrade(mo_Grade);

        return mo_Grade;
    }
}
