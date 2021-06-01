package com.telusko.demo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.StudentRepo;

@Controller
public class StudentController {

	@Autowired
	StudentRepo repo;

	@RequestMapping("/")
	public String home() {
		System.out.println("hi");
		return "home.jsp";
	}
	
	

	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		if(validateStudent(student)){
			int id= student.getRollnum();
			Student s = repo.findById(id).orElse(null);
			if(s == null){
				repo.save(student);
			}
		}
		return "home.jsp";
	}

	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int rollnum) {
		ModelAndView mv= new ModelAndView("home.jsp");
		Student student = null;
		if(rollnum > 0){
			student = repo.findById(rollnum).orElse(null);
		}
		if(student == null){
			mv.addObject("obj", new Student());
		}else{
			mv.addObject("obj", student);
		}
		return mv;
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int rollnum) {
		if(rollnum > 0){
			Student student= repo.findById(rollnum).orElse(null);
			if(student != null)
				repo.delete(student);
		}
		return "home.jsp";
	}

	@RequestMapping("/updateStudent")
	public String updateStudent(Student student) {
		if(validateStudent(student)){
			int id = student.getRollnum();
			Student s = repo.findById(id).orElse(null);
			if(s!=null) {
				repo.delete(s);
				repo.save(student);
			}
		}
		return "home.jsp";
	}

	private boolean validateStudent(Student student){
		return student != null && StringUtils.isNotBlank(student.getName())
						&& StringUtils.isNotBlank(student.getTech()) && student.getRollnum() > 0;
	}
}
