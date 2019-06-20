package com.jpa.one_to_many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmpAccount {

	@Id
	@Column(name = "acc_num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acc_num;
	@Column(name = "Bank_name")
	private String Bank_name;
	public int getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}
	public String getBank_name() {
		return Bank_name;
	}
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	@Override
	public String toString() {
		return "Account [acc_nu=" + acc_num + ", Bank_name=" + Bank_name + "]";
	}
	
}