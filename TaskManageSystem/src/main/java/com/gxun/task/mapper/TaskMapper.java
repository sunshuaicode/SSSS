package com.gxun.task.mapper;

import java.util.List;

import com.gxun.task.entity.CourseTask;

public interface TaskMapper {
	int addOneCourse(String courseName);

	CourseTask qryCourseByName(String courseName);
	
	List<CourseTask> qryCourses();

	List<String> showClasss();
	
	int delCourse(String cond);

}
