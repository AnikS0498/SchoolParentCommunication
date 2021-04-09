package com.cg.spc.entities;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FeeInstallment {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column
	private double installment;
	@Column
	private LocalDate dueDate;
	@Column
	private LocalDate paymentDate;
	
	@OneToOne
	private Fee fee;
	
	public FeeInstallment() {
		super();
	}

	public FeeInstallment(double installment, LocalDate dueDate, LocalDate paymentDate, Fee fee) {
		super();
		this.installment = installment;
		this.dueDate = dueDate;
		this.paymentDate = paymentDate;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getInstallment() {
		return installment;
	}

	public void setInstallment(double installment) {
		this.installment = installment;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "FeeInstallment [id=" + id + ", installment=" + installment + ", dueDate=" + dueDate + ", paymentDate="
				+ paymentDate + ", fee=" + fee + "]";
	}
	
	
	
}