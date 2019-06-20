package com.jpa.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport")
public class Passport {

	@Id
	@Column(name = "pid")
	private int pid;
	@Column(name = "pname")
	private String pname;
	@JoinColumn(name = "uid")
    @OneToOne(cascade = CascadeType.ALL)
	private User us;

	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public User getUs() {
		return us;
	}
	public void setUs(User us) {
		this.us = us;
	}
	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}