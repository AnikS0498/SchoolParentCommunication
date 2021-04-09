package com.cg.spc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Concern {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 60)
	private String description;
	@Column(length = 5)
	private boolean resolved;
	@ManyToOne	
	private Parent parent;
	@Enumerated(EnumType.STRING)
	@Column
	private ConcernType concernType;
	@Enumerated(EnumType.STRING)
	@Column
	private ConcernParty concernParty;
	
	
	public Concern() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Concern(int concernId, String concernDescription, boolean resolved, Parent parent, ConcernType concernType,
			ConcernParty concernParty) {
		super();
		this.id = concernId;
		this.description = concernDescription;
		this.resolved = resolved;
		this.parent = parent;
		this.concernType = concernType;
		this.concernParty = concernParty;
	}


	public int getConcernId() {
		return id;
	}


	public void setConcernId(int concernId) {
		this.id = concernId;
	}


	public String getConcernDescription() {
		return description;
	}


	public void setConcernDescription(String concernDescription) {
		this.description = concernDescription;
	}


	public boolean isResolved() {
		return resolved;
	}


	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}


	public Parent getParent() {
		return parent;
	}


	public void setParent(Parent parent) {
		this.parent = parent;
	}


	public ConcernType getConcernType() {
		return concernType;
	}


	public void setConcernType(ConcernType concernType) {
		this.concernType = concernType;
	}


	public ConcernParty getConcernParty() {
		return concernParty;
	}


	public void setConcernParty(ConcernParty concernParty) {
		this.concernParty = concernParty;
	}


	@Override
	public String toString() {
		return "Concern [concernId=" + id + ", concernDescription=" + description + ", resolved="
				+ resolved + ", parent=" + parent + ", concernType=" + concernType + ", concernParty=" + concernParty
				+ "]";
	}
	
	
}