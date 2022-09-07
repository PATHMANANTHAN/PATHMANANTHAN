package com.example.demo.students;

import org.springframework.stereotype.Service;

@Service
public class StaffService {
	public Staff allStaff(String staffName,	String staffHobby,	String staffAge,Student stud) {
		Staff st = new Staff();
		st.setStaffName(staffName);
		st.setStaffHobby(staffHobby);
		st.setStaffAge(staffAge);
		st.setStud(stud);

		return st;
	}
	}
	


