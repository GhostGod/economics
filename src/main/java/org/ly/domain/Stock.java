package org.ly.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Stock implements Serializable {

	private static final long serialVersionUID = -4656719772490139880L;

	//yyyyMMdd-code
	@Id
	private String id;
	private String code;
	private String name;
	private String parentCode;
	private String parentName;
	private Type type;
	//指数
	private double index;
	//涨跌幅
	private double change;
	//涨跌幅百分比
	private double percent;
	private Date createTime;

	public enum Type {
		ShenZhen, ShangHai
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getIndex() {
		return index;
	}

	public void setIndex(double index) {
		this.index = index;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", code=" + code + ", name=" + name + ", parentCode=" + parentCode + ", parentName=" + parentName
				+ ", type=" + type + ", index=" + index + ", change=" + change + ", percent=" + percent + ", createTime=" + createTime
				+ "]";
	}

}
