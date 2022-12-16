package com.boot.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class CourseDTO {
	
	 private int courseId;
	 
	 
	 private String courseName;

        private String courseDescription;

        private String courseDuration;

        private int courseFee;

}
