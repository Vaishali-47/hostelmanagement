package com.boot.entity;
	


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseEntity {

            @Id
            @GeneratedValue(strategy=GenerationType.AUTO)
            private int courseId;
            
            @NotEmpty( message="Course name can not be empty")
   	        @Column(nullable=false)
   	        @Size(min=2,max=10,message="course name must be minimum 2 characters and maximum 10")
   	     
            private String courseName;
            
            @NotEmpty( message="CourseDescription name can not be empty")
   	       
           // @Min(message="Minimum  character should be 2",value=2)
   	        //@Max(message="Maximum character should be 100",value=100)*/
            @Column(nullable=false)
            
   	        private String courseDescription;
           
            @NotEmpty( message="CourseDuration can not be empty")
            @Size(min=2,max=10,message="courseDuration name must be minimum 2 characters and maximum 10")
      	    @Column(nullable = false)
            
            private String courseDuration;
            
            @NotNull( message="CourseFee  can not be empty")
            //@Min(message="Minimum fee should be 500",value=500)
   	       // @Max(message="Maximum fee should be 1000",value=1000)
   	        @Column(nullable = false)
            
            private int courseFee;
         
            
}

	   	


