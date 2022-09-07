package com.example.demo.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/school")
public class HomeController {
	
	@Autowired
	public StudentService studentService;
	
	@Autowired
	public StaffService staffService;
	
//	@PostMapping("/student/details")
//	public Student addStudent(@RequestBody Student student) {
//		return studentService.allStudent(student.getFatherName(), student.getHobby(),student.getName(),student.getMotherName()) ;
//	}
	
	@PostMapping("/staff/details")
	public Staff addStaff(@RequestBody Staff staff) {
		return staffService.allStaff(staff.getStaffAge(), staff.getStaffHobby(), staff.getStaffName(),staff.getStud());
}
}