package com.redhat.prudential_poc.com.redhat.prudential_poc.pojo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("被保險人")
public class Insured implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "身分別")
	private java.lang.String identification;
	@org.kie.api.definition.type.Label(value = "姓名")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "ID")
	private java.lang.String insuredId;
	@org.kie.api.definition.type.Label(value = "年齡")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label(value = "性別")
	private java.lang.String sex;
	@org.kie.api.definition.type.Label(value = "戶籍地址")
	private java.lang.String homeAddr;
	@org.kie.api.definition.type.Label(value = "通訊地址")
	private java.lang.String mailingAddr;
	@org.kie.api.definition.type.Label(value = "手機")
	private java.lang.String cellNo;
	@org.kie.api.definition.type.Label(value = "保額")
	private java.lang.Integer amount;
	@org.kie.api.definition.type.Label(value = "要保人ID")
	private java.lang.String id;

	public Insured() {
	}

	public java.lang.String getIdentification() {
		return this.identification;
	}

	public void setIdentification(java.lang.String identification) {
		this.identification = identification;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getInsuredId() {
		return this.insuredId;
	}

	public void setInsuredId(java.lang.String insuredId) {
		this.insuredId = insuredId;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getSex() {
		return this.sex;
	}

	public void setSex(java.lang.String sex) {
		this.sex = sex;
	}

	public java.lang.String getHomeAddr() {
		return this.homeAddr;
	}

	public void setHomeAddr(java.lang.String homeAddr) {
		this.homeAddr = homeAddr;
	}

	public java.lang.String getMailingAddr() {
		return this.mailingAddr;
	}

	public void setMailingAddr(java.lang.String mailingAddr) {
		this.mailingAddr = mailingAddr;
	}

	public java.lang.String getCellNo() {
		return this.cellNo;
	}

	public void setCellNo(java.lang.String cellNo) {
		this.cellNo = cellNo;
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public Insured(java.lang.String identification, java.lang.String name,
			java.lang.String insuredId, java.lang.Integer age,
			java.lang.String sex, java.lang.String homeAddr,
			java.lang.String mailingAddr, java.lang.String cellNo,
			java.lang.Integer amount, java.lang.String id) {
		this.identification = identification;
		this.name = name;
		this.insuredId = insuredId;
		this.age = age;
		this.sex = sex;
		this.homeAddr = homeAddr;
		this.mailingAddr = mailingAddr;
		this.cellNo = cellNo;
		this.amount = amount;
		this.id = id;
	}

}