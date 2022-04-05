package com.tec.SecondHiber;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question
{
	@Id
	private int qNo;
	private String question;
	@JoinColumn(name="ans")
	@OneToOne(cascade = CascadeType.ALL)
	private Answere ans;
	public int getqNo() {
		return qNo;
	}
	public void setqNo(int qNo) {
		this.qNo = qNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answere getAns() {
		return ans;
	}
	public void setAns(Answere ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qNo=" + qNo + ", question=" + question + ", ans=" + ans + "]";
	}
	public Question(int qNo, String question) {
		super();
		this.qNo = qNo;
		this.question = question;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
