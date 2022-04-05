package com.tec.SecondHiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answere 
{
	@Id
	private int aId;
	private String ans;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Answere [aId=" + aId + ", ans=" + ans + "]";
	}
	public Answere(int aId, String ans) {
		super();
		this.aId = aId;
		this.ans = ans;
	}
	public Answere() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
