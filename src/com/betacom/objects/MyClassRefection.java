package com.betacom.objects;

public class MyClassRefection {
	private Integer id;
	private String  desc;
	private Integer p1;
	
	public MyClassRefection() {
	}

	public MyClassRefection(Integer id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
	
	public MyClassRefection(Integer id, String desc, Integer p1) {
		super();
		this.id = id;
		this.desc = desc;
		this.p1 = p1;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	
	@Override
	public String toString() {
		return "MyClassRefection [id=" + id + ", desc=" + desc + ", p1=" + p1 + "]";
	}
	

}
