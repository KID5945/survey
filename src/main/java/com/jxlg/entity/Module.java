package com.jxlg.entity;

import com.jxlg.utils.PageHelper;

/**
 * 模板实体类
 * 
 * @author feng
 * 
 */
public class Module extends PageHelper<Module> {
	private int id; // 模板id
	private String type; // 模板类型
	private Boolean muse; // 模板是否启用
	private String mexplain;// 模板说明
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getMuse() {
		return muse;
	}

	public void setMuse(Boolean muse) {
		this.muse = muse;
	}

	public String getMexplain() {
		return mexplain;
	}

	public void setMexplain(String mexplain) {
		this.mexplain = mexplain;
	}

	public Module(int id, String type, Boolean muse, String mexplain) {
		super();
		this.id = id;
		this.type = type;
		this.muse = muse;
		this.mexplain = mexplain;
	}
	public Module(String type, Boolean muse, String mexplain) {
		super();
		this.type = type;
		this.muse = muse;
		this.mexplain = mexplain;
	}

	public Module() {
		super();
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", type=" + type + ", muse=" + muse
				+ ", mexplain=" + mexplain + "]";
	}


	
}
