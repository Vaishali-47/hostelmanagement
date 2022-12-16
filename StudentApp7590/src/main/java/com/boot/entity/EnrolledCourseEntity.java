package com.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString


public class EnrolledCourseEntity {
	
	private static final String GenerationType = null;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO);
	  private int enrolledId;
	  
	  @ManyToOne
	  @JoinColumn(name="Sid")
	  private StudentEntity student;
	  
	  
	  @ManyToOne
	  @JoinColumn(name="Cid")
	  private CourseEntity Course;


}
