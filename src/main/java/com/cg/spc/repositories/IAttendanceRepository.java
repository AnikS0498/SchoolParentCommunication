package com.cg.spc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spc.entities.Attendance;

public interface IAttendanceRepository extends JpaRepository<Attendance, Integer> {

	public List<Attendance> findByPresent(boolean present);
//	public List<Attendance> findByAbsent(boolean present);
	
}
