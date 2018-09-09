package com.gxun.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxun.task.service.IStudentService;
import com.mysql.fabric.Response;

@Controller
@RequestMapping("/studentinfo")
public class StudentInfoController {
	@Autowired
	IStudentService iss;
	//插入学生信息
	@RequestMapping("/s_insert")
	public String insertStudentInfo(String stuNo,String stuPwd,String stuName,String stuCollege,String stuClass) {
		boolean result = iss.isInsertStudent(stuNo, stuPwd, stuName, stuCollege, stuClass);
		if (result){
			  return "add_class";
		   }
		   return "add_class";
		
	}
	//查询所有学生信息
		@RequestMapping("/s_search") 
		@ResponseBody
		public String searchStudentInfo() {
			String json = iss.isSearchStudent();
			return json;		
		}

}
