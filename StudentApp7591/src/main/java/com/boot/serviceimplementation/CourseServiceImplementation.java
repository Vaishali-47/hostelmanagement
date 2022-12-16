package com.boot.serviceimplementation;
import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.CourseEntity;
import com.boot.entity.StudentEntity;
import com.boot.exception.ResourceNotFoundException;
import com.boot.payload.CourseDTO;
import com.boot.repository.CourseRepository;
import com.boot.service.CourseService;

@Service
public class CourseServiceImplementation implements CourseService{
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CourseDTO addCourse(CourseDTO course) {
		CourseEntity courseEntity = this.modelMapper.map(course, CourseEntity.class);
		   CourseEntity savedCourse =this.courseRepository.save(courseEntity);
		   return this.modelMapper.map(savedCourse, CourseDTO.class);
		
	}

	@Override
	public List<CourseDTO> getAllCourseList() {
		List<CourseEntity> courseList =this.courseRepository.findAll();
		List<CourseDTO>  courseListDto = courseList.stream()
				                                    .map(course->this.modelMapper.map(course, CourseDTO.class)) 
				                                    .collect(Collectors.toList());

		return courseListDto;

	}


	@Override
	public CourseDTO getCourseById(int courseId) {
        CourseDTO courseObj=this.courseRepository.
                findById(courseId).orElseThrow(()-> new ResourceNotFoundException("course","courseID", courseId));	          
      
           return this.modelMapper.map(courseObj,CourseDTO.class);


	}

	@Override
	public void deleteCourseById(int courseId) {
		if(this.courseRepository.existsById(courseId))
		{
			this.courseRepository.deleteById(courseId);
		}
		else
		{
			throw new ResourceNotFoundException("course","courseID", courseId);	
		}
	}

	@Override
	public CourseDTO updateCourseById(CourseDTO course, int courseId) {
		 if(this.courseRepository.existsById(courseId))
		    {
		    	CourseEntity courseObj= this.modelMapper.map(course, CourseEntity.class);
		    	CourseEntity updatedcourse=this.courseRepository.save(courseObj);
		    	
		    	return this.modelMapper.map(updatedcourse, CourseDTO.class);
		    	}
		    else
		    {
		    	throw new ResourceNotFoundException("course","CourseID",courseId);
		    }
			}

	    

	}
	
	
	

