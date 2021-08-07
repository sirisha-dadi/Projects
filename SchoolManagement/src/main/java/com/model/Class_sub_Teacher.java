package com.model;

public class Class_sub_Teacher {
	
	private int classid;
	private int sub_id;
	private int tid;
	public Class_sub_Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Class_sub_Teacher(int classid, int sub_id, int tid) {
		super();
		this.classid = classid;
		this.sub_id = sub_id;
		this.tid = tid;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	

}
