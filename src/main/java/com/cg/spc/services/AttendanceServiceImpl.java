package com.cg.spc.services;
/*
 * Rahul
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Attendance;
import com.cg.spc.repositories.IAttendanceRepository;

@Service
public class AttendanceServiceImpl implements IAttendanceService{

	@Autowired
	IAttendanceRepository iAttendanceRepository;
	
	@Override
	public void addAttendance(Attendance attendance) {
		iAttendanceRepository.save(attendance);
	}

	@Override
	public Attendance updateAttendance(Attendance attendance) {
		Attendance at = iAttendanceRepository.save(attendance);
		return at;
	}

	@Override
	public Attendance getAttendanceDetailsById(int id) {
		return iAttendanceRepository.findById(id).get();
	}

	@Override
	public List<Attendance> getAttendanceDetails() {
		return iAttendanceRepository.findAll();
	}

	@Override
	public List<Attendance> getAttendanceDetailsByPresent(boolean isPresent) {
		return iAttendanceRepository.findByPresent(isPresent);
	}

//	@Override
//	public List<Attendance> getAttendanceDetailsByAbsent(boolean isAbsent) {
//		return iAttendanceRepository.findByAbsent(isAbsent);
//	}

	@Override
	public void deleteAttendanceById(int id) {
		iAttendanceRepository.deleteById(id);
	}

}
