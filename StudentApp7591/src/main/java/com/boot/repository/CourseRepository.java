package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.boot.payload.CourseDTO;

public interface CourseRepository extends JpaRepository<CourseDTO,Integer>
{
  
}

