package com.cg.spc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Attendance;
import com.cg.spc.services.AttendanceServiceImpl;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	AttendanceServiceImpl attendanceServiceImpl;

	@PostMapping
	public int saveAttendance(@RequestBody Attendance attendance) {
		attendanceServiceImpl.addAttendance(attendance);
		return attendance.getId();
	}
	
	@PutMapping
	public Attendance updateAttendanceDetails(@RequestBody Attendance attendance) {
		return attendanceServiceImpl.updateAttendance(attendance);
	}
	
	@GetMapping("/{id}")
	public Attendance getAttendanceById(@PathVariable("id") int id) {
		return attendanceServiceImpl.getAttendanceDetailsById(id);
	}
	
	@GetMapping
	public List<Attendance> getAllAttendance(){
		return attendanceServiceImpl.getAttendanceDetails();
	}
	
	@GetMapping("/present/{isPresent}")
	public List<Attendance> getNonAbsentees(@PathVariable("isPresent") boolean isPresent){
		return attendanceServiceImpl.getAttendanceDetailsByPresent(isPresent);
	}
	
//	@GetMapping("/present/{isPresent}")
//	public List<Attendance> getAbsentees(@PathVariable("isPresent") boolean isPresent){
//		return attendanceServiceImpl.getAttendanceDetailsByAbsent(!isPresent);
//	}
	
	@DeleteMapping("/{id}")
	public void deleteAttendanceDetailsById(@PathVariable("id") int id) {
		attendanceServiceImpl.deleteAttendanceById(id);
	}
	
}
