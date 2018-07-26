package com.jxlg.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户答案表
 * 
 * @author feng
 * 
 */
public class Useranswer {
	private int aid;// 答案id
	private int uid;// 答题者id
	private int qaid;// 问卷——题目关系id
	private String answer;// 答案
	private int age;// 答题者年龄
	private String sex;// 答题者性别
	private String openId;
	private Date createtime;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getQaid() {
		return qaid;
	}

	public void setQaid(int qaid) {
		this.qaid = qaid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Useranswer(int aid, int uid, int qaid, String answer, int age,
			String sex) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.qaid = qaid;
		this.answer = answer;
		this.age = age;
		this.sex = sex;
	}

	public Useranswer(int uid, int qaid, String answer, int age, String sex) {
		super();
		this.uid = uid;
		this.qaid = qaid;
		this.answer = answer;
		this.age = age;
		this.sex = sex;
	}

	public Useranswer(int aid, int uid, int qaid, String answer, int age,
			String sex, String openId, Date createtime) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.qaid = qaid;
		this.answer = answer;
		this.age = age;
		this.sex = sex;
		this.openId = openId;
		this.createtime = createtime;
	}

	public Useranswer() {
		super();
	}


	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Useranswer [aid=" + aid + ", uid=" + uid + ", qaid=" + qaid
				+ ", answer=" + answer + ", age=" + age + ", sex=" + sex
				+ ", openId=" + openId + ", createtime=" + createtime + "]";
	}

}
