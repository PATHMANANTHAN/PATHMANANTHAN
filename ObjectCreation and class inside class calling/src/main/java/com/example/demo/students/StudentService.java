package com.example.demo.students;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public Student allStudent(String name,String hobby,String fatherName,String motherName) {
		Student ss= new Student();
		ss.setName(name);
		ss.setHobby(hobby);
		ss.setFatherName(fatherName);
		ss.setMotherName(motherName);
		return ss;
	}

}
