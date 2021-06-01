package com.telusko.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.telusko.demo.Student;

@RepositoryRestResource(collectionResourceRel = "students", path="students")
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
//	List<Student> findByTech(String tech);
//	
//	@Query("from Student where ?1 order by stname")
//	List<Student> findByTechSorted(String tech);
}
