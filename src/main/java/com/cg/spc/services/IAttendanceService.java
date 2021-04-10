package com.cg.spc.services;

import java.util.List;

import com.cg.spc.entities.Attendance;

public interface IAttendanceService {
	
	public void addAttendance(Attendance attendance);
	public Attendance updateAttendance(Attendance attendance);
	public Attendance getAttendanceDetailsById(int id);
	public List<Attendance> getAttendanceDetails();
	public void deleteAttendanceById(int id);
	public List<Attendance> getAttendanceDetailsByPresent(boolean isPresent);
//	public List<Attendance> getAttendanceDetailsByAbsent(boolean isAbsent);
}
