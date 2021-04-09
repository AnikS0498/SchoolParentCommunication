package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fee {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Student student;
	@Column
	private double totalFeesDue;
	@Column
	private double totalFeesReceived;
	@Column
	private LocalDate startMonthYear;
	@Column
	private LocalDate endMonthYear;
	
	public Fee() {
		super();
	}

	public Fee(Student student, double totalFeesDue, double totalFeesReceived, LocalDate startMonthYear,
			LocalDate endMonthYear) {
		super();
		this.student = student;
		this.totalFeesDue = totalFeesDue;
		this.totalFeesReceived = totalFeesReceived;
		this.startMonthYear = startMonthYear;
		this.endMonthYear = endMonthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getTotalFeesDue() {
		return totalFeesDue;
	}

	public void setTotalFeesDue(double totalFeesDue) {
		this.totalFeesDue = totalFeesDue;
	}

	public double getTotalFeesReceived() {
		return totalFeesReceived;
	}

	public void setTotalFeesReceived(double totalFeesReceived) {
		this.totalFeesReceived = totalFeesReceived;
	}

	public LocalDate getStartMonthYear() {
		return startMonthYear;
	}

	public void setStartMonthYear(LocalDate startMonthYear) {
		this.startMonthYear = startMonthYear;
	}

	public LocalDate getEndMonthYear() {
		return endMonthYear;
	}

	public void setEndMonthYear(LocalDate endMonthYear) {
		this.endMonthYear = endMonthYear;
	}

	@Override
	public String toString() {
		return "Fee [id=" + id + ", student=" + student + ", totalFeesDue=" + totalFeesDue + ", totalFeesReceived="
				+ totalFeesReceived + ", startMonthYear=" + startMonthYear + ", endMonthYear=" + endMonthYear + "]";
	}

	

}