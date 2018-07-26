package com.jxlg.entity;

import org.springframework.cglib.core.TinyBitSet;

/**
 * 问题实体类
 * 
 * @author feng
 * 
 */
public class Problem {
	private int pid; // 问题id
	private String question; // 问题
	private String aanswer; // a选项
	private String banswer; // b选项
	private String canswer; // c选项
	private String danswer; // d选项
	private int ptid; // 题目类型id
	private Boolean puse;// 是否启用

	public int getPid() {
		return pid;
	}

	public void setPid(int id) {
		this.pid = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAanswer() {
		return aanswer;
	}

	public void setAanswer(String aanswer) {
		this.aanswer = aanswer;
	}

	public String getBanswer() {
		return banswer;
	}

	public void setBanswer(String banswer) {
		this.banswer = banswer;
	}

	public String getCanswer() {
		return canswer;
	}

	public void setCanswer(String canswer) {
		this.canswer = canswer;
	}

	public String getDanswer() {
		return danswer;
	}

	public void setDanswer(String danswer) {
		this.danswer = danswer;
	}

	
	public int getPtid() {
		return ptid;
	}

	public void setPtid(int ptid) {
		this.ptid = ptid;
	}

	public Boolean getPuse() {
		return puse;
	}

	public void setPuse(Boolean puse) {
		this.puse = puse;
	}

	public Problem(int pid, String question, String aanswer, String banswer,
			String canswer, String danswer, int agrade, int bgrade, int cgrade,
			int dgrade, int ptid, Boolean puse) {
		super();
		this.pid = pid;
		this.question = question;
		this.aanswer = aanswer;
		this.banswer = banswer;
		this.canswer = canswer;
		this.danswer = danswer;
		this.ptid = ptid;
		this.puse = puse;
	}
	public Problem(String question, String aanswer, String banswer,
			String canswer, String danswer,  int ptid, Boolean puse) {
		super();
		this.question = question;
		this.aanswer = aanswer;
		this.banswer = banswer;
		this.canswer = canswer;
		this.danswer = danswer;
		this.ptid = ptid;
		this.puse = puse;
	}

	public Problem() {
		super();
	}

	@Override
	public String toString() {
		return "Problem [pid=" + pid + ", question=" + question + ", aanswer="
				+ aanswer + ", banswer=" + banswer + ", canswer=" + canswer
				+ ", danswer=" + danswer + ", agrade=" + ", ptid=" + ptid + ", puse=" + puse + "]";
	}

}
