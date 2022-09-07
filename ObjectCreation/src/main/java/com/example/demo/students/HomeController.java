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
	
	@Autowired
	public WorkerService workerService;
	
	@PostMapping("/student/details")
	public Student addStudent(@RequestBody Student student) {
		return studentService.allStudent(student.getName(),student.getHobby(),student.getFatherName(),student.getMotherName()) ;
	}

	@PostMapping("/staff/details")
	public Staff addStaff(@RequestBody Staff staff) {
		return staffService.allStaff(staff.getStaffName(), staff.getStaffHobby(),staff.getStaffAge(), staff.getStud());
	}
		
	@PostMapping("/worker/details")
	public Worker addWorker(@RequestBody Worker work) {
	return workerService.allWorker( work.getWorkerName(),work.getWorkerAge(),work.getWorkerAddress(),work.getSs(),work.getSt()) ;
	}
}