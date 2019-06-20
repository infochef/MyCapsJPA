package com.jpa.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class TrainerList {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	@Column
	private String tname;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<StudentList>student;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<StudentList> getStudent() {
		return student;
	}
	public void setStudent(Set<StudentList> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", student=" + student + "]";
	}
	
	
}