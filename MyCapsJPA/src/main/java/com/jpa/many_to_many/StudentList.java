package com.jpa.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class StudentList {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name ="sid"),
	inverseJoinColumns = @JoinColumn(name = "tid"))
	private Set<TrainerList>trainer;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<TrainerList> getTrainer() {
		return trainer;
	}
	public void setTrainer(Set<TrainerList> trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", trainer=" + trainer + "]";
	}


}