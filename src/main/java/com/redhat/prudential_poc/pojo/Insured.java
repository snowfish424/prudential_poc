package com.redhat.prudential_poc.pojo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("被保險人")
public class Insured implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("要保人身分別")
	private java.lang.String appIdentification;
	@org.kie.api.definition.type.Label("要保人姓名")
	private java.lang.String appName;
	@org.kie.api.definition.type.Label("要保人ID")
	private java.lang.String appId;
	@org.kie.api.definition.type.Label("要保人年齡")
	private java.lang.Integer appAge;
	@org.kie.api.definition.type.Label("要保人性別")
	private java.lang.String appSex;
	@org.kie.api.definition.type.Label("要保人戶籍地址")
	private java.lang.String appHomeAddr;
	@org.kie.api.definition.type.Label("要保人通訊地址")
	private java.lang.String appMailingAddr;
	@org.kie.api.definition.type.Label("要保人手機號碼")
	private java.lang.String appCellNo;

	@org.kie.api.definition.type.Label("身分別")
	private java.lang.String identification;
	@org.kie.api.definition.type.Label("姓名")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("ID")
	private java.lang.String insuredId;
	@org.kie.api.definition.type.Label("年齡")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("性別")
	private java.lang.String sex;
	@org.kie.api.definition.type.Label("戶籍地址")
	private java.lang.String homeAddr;
	@org.kie.api.definition.type.Label("通訊地址")
	private java.lang.String mailingAddr;
	@org.kie.api.definition.type.Label("手機")
	private java.lang.String cellNo;
	@org.kie.api.definition.type.Label("保額")
	private java.lang.Integer amount;

	@org.kie.api.definition.type.Label("核保結果")
	private java.lang.String status;

	@org.kie.api.definition.type.Label("身心障礙者")
	private java.lang.Boolean handicapped;

	@org.kie.api.definition.type.Label("監護宣告")
	private java.lang.Boolean guardian;

	@org.kie.api.definition.type.Label("商品")
	private java.lang.String product;

	@org.kie.api.definition.type.Label("二個月內是否曾因受傷或生病接受醫生治療、診療或用藥")
	private java.lang.Boolean treated2m;

	@org.kie.api.definition.type.Label("過去五年內是否曾患有高血壓症")
	private java.lang.Boolean treated5y1;

	@org.kie.api.definition.type.Label("過去五年內是否曾患有腦中風")
	private java.lang.Boolean treated5y2;

	@org.kie.api.definition.type.Label("過去五年內是否曾患有肺氣腫")
	private java.lang.Boolean treated5y3;

	@org.kie.api.definition.type.Label("高保額")
	private java.lang.Boolean highPremium;

	@org.kie.api.definition.type.Label("與被保險人之關係")
	private java.lang.String relation;

	@org.kie.api.definition.type.Label(value = "保單總額")
	private java.lang.Integer totalAmt;

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

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Boolean getHandicapped() {
		return this.handicapped;
	}

	public void setHandicapped(java.lang.Boolean handicapped) {
		this.handicapped = handicapped;
	}

	public java.lang.Boolean getGuardian() {
		return this.guardian;
	}

	public void setGuardian(java.lang.Boolean guardian) {
		this.guardian = guardian;
	}

	public java.lang.String getProduct() {
		return this.product;
	}

	public void setProduct(java.lang.String product) {
		this.product = product;
	}

	public java.lang.Boolean getTreated2m() {
		return this.treated2m;
	}

	public void setTreated2m(java.lang.Boolean treated2m) {
		this.treated2m = treated2m;
	}

	public java.lang.Boolean getTreated5y1() {
		return this.treated5y1;
	}

	public void setTreated5y1(java.lang.Boolean treated5y1) {
		this.treated5y1 = treated5y1;
	}

	public java.lang.Boolean getTreated5y2() {
		return this.treated5y2;
	}

	public void setTreated5y2(java.lang.Boolean treated5y2) {
		this.treated5y2 = treated5y2;
	}

	public java.lang.Boolean getTreated5y3() {
		return this.treated5y3;
	}

	public void setTreated5y3(java.lang.Boolean treated5y3) {
		this.treated5y3 = treated5y3;
	}

	public java.lang.Boolean getHighPremium() {
		return this.highPremium;
	}

	public void setHighPremium(java.lang.Boolean highPremium) {
		this.highPremium = highPremium;
	}

	public java.lang.String getAppIdentification() {
		return appIdentification;
	}

	public void setAppIdentification(java.lang.String appIdentification) {
		this.appIdentification = appIdentification;
	}

	public java.lang.String getAppName() {
		return appName;
	}

	public void setAppName(java.lang.String appName) {
		this.appName = appName;
	}

	public java.lang.String getAppId() {
		return appId;
	}

	public void setAppId(java.lang.String appId) {
		this.appId = appId;
	}

	public java.lang.Integer getAppAge() {
		return appAge;
	}

	public void setAppAge(java.lang.Integer appAge) {
		this.appAge = appAge;
	}

	public java.lang.String getAppSex() {
		return appSex;
	}

	public void setAppSex(java.lang.String appSex) {
		this.appSex = appSex;
	}

	public java.lang.String getAppHomeAddr() {
		return appHomeAddr;
	}

	public void setAppHomeAddr(java.lang.String appHomeAddr) {
		this.appHomeAddr = appHomeAddr;
	}

	public java.lang.String getAppMailingAddr() {
		return appMailingAddr;
	}

	public void setAppMailingAddr(java.lang.String appMailingAddr) {
		this.appMailingAddr = appMailingAddr;
	}

	public java.lang.String getAppCellNo() {
		return appCellNo;
	}

	public void setAppCellNo(java.lang.String appCellNo) {
		this.appCellNo = appCellNo;
	}

	public Insured(java.lang.String identification, java.lang.String name,
			java.lang.String insuredId, java.lang.Integer age,
			java.lang.String sex, java.lang.String homeAddr,
			java.lang.String mailingAddr, java.lang.String cellNo,
			java.lang.Integer amount, java.lang.String id,
			java.lang.String status, java.lang.Boolean handicapped,
			java.lang.Boolean guardian, java.lang.String product,
			java.lang.Boolean treated2m, java.lang.Boolean treated5y1,
			java.lang.Boolean treated5y2, java.lang.Boolean treated5y3,
			java.lang.Boolean highPremium) {
		this.identification = identification;
		this.name = name;
		this.insuredId = insuredId;
		this.age = age;
		this.sex = sex;
		this.homeAddr = homeAddr;
		this.mailingAddr = mailingAddr;
		this.cellNo = cellNo;
		this.amount = amount;
		this.status = status;
		this.handicapped = handicapped;
		this.guardian = guardian;
		this.product = product;
		this.treated2m = treated2m;
		this.treated5y1 = treated5y1;
		this.treated5y2 = treated5y2;
		this.treated5y3 = treated5y3;
		this.highPremium = highPremium;
	}

	public java.lang.String getRelation() {
		return this.relation;
	}

	public void setRelation(java.lang.String relation) {
		this.relation = relation;
	}

	public java.lang.Integer getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(java.lang.Integer totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Insured(java.lang.String appIdentification,
			java.lang.String appName, java.lang.String appId,
			java.lang.Integer appAge, java.lang.String appSex,
			java.lang.String appHomeAddr, java.lang.String appMailingAddr,
			java.lang.String appCellNo, java.lang.String identification,
			java.lang.String name, java.lang.String insuredId,
			java.lang.Integer age, java.lang.String sex,
			java.lang.String homeAddr, java.lang.String mailingAddr,
			java.lang.String cellNo, java.lang.Integer amount,
			java.lang.String status, java.lang.Boolean handicapped,
			java.lang.Boolean guardian, java.lang.String product,
			java.lang.Boolean treated2m, java.lang.Boolean treated5y1,
			java.lang.Boolean treated5y2, java.lang.Boolean treated5y3,
			java.lang.Boolean highPremium, java.lang.String relation,
			java.lang.Integer totalAmt) {
		this.appIdentification = appIdentification;
		this.appName = appName;
		this.appId = appId;
		this.appAge = appAge;
		this.appSex = appSex;
		this.appHomeAddr = appHomeAddr;
		this.appMailingAddr = appMailingAddr;
		this.appCellNo = appCellNo;
		this.identification = identification;
		this.name = name;
		this.insuredId = insuredId;
		this.age = age;
		this.sex = sex;
		this.homeAddr = homeAddr;
		this.mailingAddr = mailingAddr;
		this.cellNo = cellNo;
		this.amount = amount;
		this.status = status;
		this.handicapped = handicapped;
		this.guardian = guardian;
		this.product = product;
		this.treated2m = treated2m;
		this.treated5y1 = treated5y1;
		this.treated5y2 = treated5y2;
		this.treated5y3 = treated5y3;
		this.highPremium = highPremium;
		this.relation = relation;
		this.totalAmt = totalAmt;
	}

}