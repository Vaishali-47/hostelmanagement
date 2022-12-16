package com.boot.payload;

import java.util.ArrayList;
import java.util.List;

import com.boot.entity.EnrolledCourseEntity;


@Getter
@Setter
@NoArgsConstructor
@ToString

public class CourseDTO
{
	private int courseId;
	private String courseName;
	private String courseDescription;
	private String courseDuration;
	private int courseFee;
	
	private List<EnrolledCourseEntity> courseList=new ArrayList<>();



}
